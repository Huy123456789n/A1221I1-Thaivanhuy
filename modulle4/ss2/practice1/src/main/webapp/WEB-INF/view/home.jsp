<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 7/20/2022
  Time: 6:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/validate" method="post">
<input type="text" name="email">
    <input type="submit" value="submit">
    <label>${message}</label>
</form>
</body>
</html>
