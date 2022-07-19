<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/trans" method="post">
    <label id="dollar">Dollar</label>
    <input type="text" name="dollar" value="${dollar}">
    <label id="Vnd">VND</label>
    <span>${Vnd}</span>
    <input type="submit" value="submit">
</form>
</body>
</html>