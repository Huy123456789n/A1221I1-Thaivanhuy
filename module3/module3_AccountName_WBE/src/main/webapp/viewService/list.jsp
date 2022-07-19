
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous">
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>List Customer</h2>
<form method="get" action="/customer">
    <label for="search">Choose How To Search:</label>
    <select name="action" id="search">
        <option value="searchByName">Search By Name</option>
        <option value="searchByAddress">Search by address</option>
        <option value="SearchByCmnd">Search By CMND</option>
    </select>
    <input type="text" name="name" placeholder="Search">
    <button type="submit">Search</button>
</form>
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Area</th>
        <th scope="col">Service Cost</th>
        <th scope="col">Max PeoPle</th>
        <th scope="col">Rent Type ID</th>
        <th scope="col">Service Type ID</th>
        <th scope="col">Standard Room</th>
        <th scope="col">Description</th>
        <th scope="col">Pool Area</th>
        <th scope="col">Number Of Floors</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${service}" var="service" >
        <tr>
            <th scope="row"><c:out value="${service.getId()}"></c:out></th>
            <td><c:out value="${service.getName()}"></c:out></td>
            <td><c:out value="${service.getArea()}"></c:out></td>
            <td><c:out value="${service.getCost()}"></c:out></td>
            <td><c:out value="${service.getMaxPeople()}"></c:out></td>
            <td><c:out value="${service.getRentType()}"></c:out></td>
            <td><c:out value="${service.getServiceTypeName()}"></c:out></td>
            <td><c:out value="${service.getStandardRoom()}"></c:out></td>
            <td><c:out value="${service.getDescription()}"></c:out></td>
            <td><c:out value="${service.getPoolArea()}"></c:out></td>
            <td><c:out value="${service.getNumberOfFloors()}"></c:out></td>
            <td><button type="button" class="btn btn-warning"><a href="/customer?action=update&id=${customer.getId()}" style="text-decoration: none; color: white ">Edit</a></button></td>
            <td><button type="button" class="btn btn-danger"><a href="/service?action=delete&id=${service.getId()}" style="text-decoration: none; color: white" >Delete</a></button></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button type="button" class="btn btn-danger" style="display: inline-block">
    <a style="text-decoration:none;color: white; " id="create" href="/service?action=create">Create New User</a>
</button>
<button type="button" class="btn btn-danger" style="display: inline-block">
    <a style="text-decoration:none;color: white; " id="home" href="/Admin">HomePage</a>
</button>
</body>
</html>
