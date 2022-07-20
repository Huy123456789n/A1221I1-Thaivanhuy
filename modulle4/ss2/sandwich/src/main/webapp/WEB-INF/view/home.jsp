<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 7/20/2022
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save" method="post">
    <label>Lettuce</label>
<input type="checkbox" value="Lettuce" name="condiment">
    <label>Tomato</label>
<input type="checkbox" value="Tomato" name="condiment">
    <label>Apple</label>
<input type="checkbox" value="Apple" name="condiment">
    <label>Banana</label>
<input type="checkbox" value="Banana" name="condiment">
    <input type="submit" value="submit">
</form>
</body>
</html>
