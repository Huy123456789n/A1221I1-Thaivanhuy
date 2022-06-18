<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/16/2022
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Are you Sure?</h1>
<form method="post">
    <table>
        <tr>
            <td>Id </td>
            <td>${customer.getId()}</td>
        </tr>
        <tr>
            <td>Name </td>
            <td>${customer.getName()}</td>
        </tr>
        <tr>
            <td>Email </td>
            <td>${customer.getEmail()}</td>
        </tr>
        <tr>
            <td>Address </td>
            <td>${customer.getAddress()}</td>
        </tr>
    </table>
    <button type="submit">Delete</button>
</form>
</body>
</html>
