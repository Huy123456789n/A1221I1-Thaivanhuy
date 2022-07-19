
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
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
<%--Edit--%>
<form method="post" style="width: 30%">
    <label>Name</label>
    <input type="text" class="form-control" name="name" id="name" placeholder="Enter Name">

    <label>Phone Number</label>
    <input type="text" class="form-control" name="sdt" placeholder="Enter Phone Number">

    <label>Star Day</label>
    <input type="text" class="form-control" name="starDay" placeholder="Enter Name">

    <label>Note</label>
    <input type="text" class="form-control" name="note" placeholder="Enter Name">

    <%--  Drop list từ table 2--%>
    <label>Category</label>
    <label>Choose How To Category :</label>
    <select name="payType">
        <c:forEach items="${payType}" var="e">
            <option value="${e.idThanhToan}">${e.nameThanhToan}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Submit" class="btn btn-danger">
</form>
<button type="button" class="btn btn-danger">
    <a href="/room" style="text-decoration: none; color: white">Back To List</a>
</button>
</body>
</html>
