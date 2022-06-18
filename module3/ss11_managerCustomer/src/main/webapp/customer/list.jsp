
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer List</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
          crossorigin="anonymous">
</head>
<body>
<h1>Customer List</h1>
<p>
    <a href="/customer?action=create">Create new customer</a>
</p>
<table class="table" border="1">
    <thead>
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    </thead>
    <c:forEach items='${requestScope["customerList"]}' var="customer">
        <tr>
            <td><a href="/customer?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td><a href="/customer?action=edit&id=${customer.getId()}">edit</a></td>
            <td><a href="/customer?action=delete&id=${customer.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
