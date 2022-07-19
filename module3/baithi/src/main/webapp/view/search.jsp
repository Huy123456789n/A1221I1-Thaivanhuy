
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
<table class="table table-striped">
<thead>
<tr>
    <th scope="col">Id</th>
    <th scope="col">Name</th>
    <th scope="col">Phone Number</th>
    <th scope="col">Star Day</th>
    <th scope="col">Pay type</th>
    <th scope="col">Description</th>
</tr>
</thead>
<tbody>
<c:forEach items="${room}" var="p">
    <tr>
        <th scope="row">${p.id}</th>
        <td>${p.name}</td>
        <td>${p.sdt}</td>
        <td>${p.starDay}</td>
        <td>${p.note}</td>
        <td>${p.nameThanhToan}</td>
    </tr>
</c:forEach>
</tbody>
</table>
<button type="button" class="btn btn-danger">
    <a href="/room" style="text-decoration: none; color: white">Back To List</a>
</button>
</body>
</html>
