
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
<h2>Information</h2>
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

        <tr>
            <th scope="row">${p.id}</th>
            <td>${p.name}</td>
            <td>${p.sdt}</td>
            <td>${p.starDay}</td>
            <td>${p.note}</td>
            <td>${p.nameThanhToan}</td>
        </tr>
    </tbody>
</table>
<form method="post">
<button type="submit" class="btn btn-danger">
    Delete
</button>
</form>
<button type="button" class="btn btn-danger">
    <a href="/room" style="text-decoration: none; color: white">Back To List</a>
</button>
</body>
</html>
