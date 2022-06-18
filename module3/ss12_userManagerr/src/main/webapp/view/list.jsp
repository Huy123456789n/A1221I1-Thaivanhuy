<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/18/2022
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<body>
<h1>List User</h1>
<table class="table table-dark table-striped">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="user" var="listUser" >
    <tr>
        <th >${listUser.getId()}</th>
        <td>${listUser.getName()}</td>
        <td>${listUser.getEmail()}</td>
        <td>${listUser.getAddress}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
