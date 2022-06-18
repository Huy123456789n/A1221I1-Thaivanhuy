
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer</h1>
<form method="get">
<table>

    <tr>
        <td>Id </td>
        <td>${customer.getId()}</td>
    </tr>

    <tr>
        <td>Name</td>
        <td>${customer.getName()}</td>
    </tr>

    <tr>
        <td>Email</td>
        <td>${customer.getEmail()}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${customer.getAddress()}</td>
    </tr>
</table>
</form>
</body>
</html>
