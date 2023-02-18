<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form>
        <div align="center">
            <font size="30px">${date}的排班计划</font><br>
            <font size="20px">今日值班的医生</font>
            <table border="1px" cellspacing="0px" cellpadding="0px">
                    <tr>
                        <td>医生编号</td>
                        <td>医生姓名</td>
                        <td>操作</td>

                    </tr>
                    <c:forEach items="${stafinfos}" var="stafinfo">
                        <tr>
                        <td>${stafinfo.stafid}</td>
                        <td>${stafinfo.stafname}</td>
                        <td><a href="/deleteDuty?stafid=${stafinfo.stafid}&date=${date}">取消值班</a></td>
                        </tr>
                    </c:forEach>
            </table>

            <table border="1px" cellspacing="0px" cellpadding="0px">
                <tr>
                    <td>医生编号</td>
                    <td>医生姓名</td>
                    <td>操作</td>
                </tr>
                <c:forEach items="${stafs}" var="staf">
                    <c:if test="${staf.stafid!=8}">
                        <tr>
                            <td>${staf.stafid}</td>
                            <td>${staf.stafname}</td>
                            <td><a href="/addDuty?stafid=${staf.stafid}&date=${date}">值班</a></td>
                        </tr>
                    </c:if>
                </c:forEach>
            </table>

        </div>
    </form>
    <button onclick="window.location.href='/cgq&yjf/paiban.jsp'">返回</button>

</body>
</html>
