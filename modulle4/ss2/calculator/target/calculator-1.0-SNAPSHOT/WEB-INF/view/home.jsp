<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 7/20/2022
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculator" method="post">
<label>Nhập Number A</label>
<input type="number" name="numberA">
<label>Nhập Number B</label>
<input type="number" name="numberB">
    <label>Add</label>
<input type="radio" name="calculator" value="add">
    <label>Sub</label>
<input type="radio" name="calculator" value="sub">
    <label>Mul</label>
<input type="radio" name="calculator" value="mul">
    <label>Div</label>
<input type="radio" name="calculator" value="div">
    <label>${result}</label>
<input type="submit" value="submit">
</form>
</body>
</html>
