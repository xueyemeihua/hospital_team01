<%--
  Created by IntelliJ IDEA.
  User: 25791
  Date: 2023/2/15
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <script src="xylq/src/js/jquery-1.12.4.js"></script>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body>
1111
    <form action="/selectDeptApplicants">

        <tr>
            <td> <label>科室:</label></td>
            <td>
                <select name="deptid" id="dept" onchange="selectPosts()">
                    <option value="0">选择部门</option>
                    <c:forEach var="dept" items="${depts}">
                        <option value="${dept.deptid}">${dept.deptname}</option>
                    </c:forEach>
                </select>
        <tr>
            <td align="right">岗位:</td>
            <td>
                <select id="posts" name="postid"></select>
            </td>
        </tr>
            </td>
        </tr>

        <input type="submit" value="查询">
    </form>


    <table>
        <tr></tr>
        <tr></tr>




    </table>

${applicants}

    <script>
        function selectPosts() {
            $.get("http://localhost:8080/selectPost","deptid="+$("#dept").val(),function (data){
                var jsonData=eval("("+data+")")
                var s = ''
                if (jsonData.length != 0) {
                    for (var i = 0; i < jsonData.length; i++) {
                        $("#posts").children().remove();
                        s += "<option value='" +
                            jsonData[i].postid +
                            "'>" +
                            jsonData[i].postname +
                            "</option>"
                    }
                    $("#posts").append(s)
                } else {
                    $("#posts").children().remove();
                }
            })
        }









    </script>




</body>
</html>
