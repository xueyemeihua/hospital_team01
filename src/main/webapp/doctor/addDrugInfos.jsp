<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>添加drugInfos 表</title>
</head>
<body>

<form action="/addDrugInfoServlet" method="post">
<%--  药品编号<input name="drugid"/><br/>--%>
  药品名称<input name="drugname"/><br/>
  药品库存<input name="druginven"/><br/>
  药品价格<input name="drugprice"/><br/>
  药品有效期<input type="date"name="drugindate"/><br/>
  药品生产日期<input type="date"name="drugprodate"/><br/>
  药品生产厂家<select name="drugfac">
    <option value="0">请选择</option>
    <c:forEach var="fac" items="${facs}">
        <option value="${fac.drugfac}">${fac.drugfacname}</option>
    </c:forEach>
</select>
    <br/>
  药品厂家电话<input name="facphone"/><br/>
  药品功能<input name="drugfunc"/><br/>
  药品规格<input name="drugspeci"/><br/>
  <input type="submit" value="提交"/>
</form>
</body>
</html>
