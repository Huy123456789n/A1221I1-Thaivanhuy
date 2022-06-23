<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/21/2022
  Time: 4:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
</head>
<body>
<h2>Are You Sure?</h2>
<form method="post">
<table class="table table-dark table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Date Of Birth</th>
        <th scope="col">CMND</th>
        <th scope="col">Phone Number</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col">Type Code</th>
        <th scope="col">Gender</th>
    </tr>
    </thead>
    <tbody>
        <tr>
            <th scope="row">${customer.getId()}</th>
            <td>${customer.getName()}</td>
            <td>${customer.getDateOfBirth()}</td>
            <td>${customer.getCmnd()}</td>
            <td>${customer.getSdt()}</td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td>${customer.getTypeCode()}</td>
            <td>${customer.getGender()}</td>
        </tr>
    </tbody>
</table>
<button type="submit" class="btn btn-danger">
    Delete
</button>
</form>
<button type="button" class="btn btn-danger">
    <a href="/customer" style="text-decoration: none; color: white">Back To List User</a>
</button>
</body>
</html>
