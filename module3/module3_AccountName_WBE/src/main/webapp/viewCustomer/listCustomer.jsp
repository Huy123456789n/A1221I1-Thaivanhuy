
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
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Date Of Birth</th>
            <th scope="col">CMND</th>
            <th scope="col">Phone Number</th>
            <th scope="col">Email</th>
            <th scope="col">Address</th>
            <th scope="col">Type Code</th>
            <th scope="col">Gender</th>
            <th scope="col">Edit</th>
            <th scope="col">Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customer}" var="customer" >
        <tr>
            <th scope="row"><c:out value="${customer.getId()}"></c:out></th>
            <td><c:out value="${customer.getName()}"></c:out></td>
            <td><c:out value="${customer.getDateOfBirth()}"></c:out></td>
            <td><c:out value="${customer.getCmnd()}"></c:out></td>
            <td><c:out value="${customer.getSdt()}"></c:out></td>
            <td><c:out value="${customer.getEmail()}"></c:out></td>
            <td><c:out value="${customer.getAddress()}"></c:out></td>
            <td><a href="/customer?action=typeCustomer&id=${customer.getId()}">${customer.getTypeCode()}</a></td>
<%--            <td><c:out value="${customer.getTypeCode()}"></c:out></td>--%>
            <td><c:out value="${customer.getGender()}"></c:out></td>
            <td><button type="button" class="btn btn-warning"><a href="/customer?action=update&id=${customer.getId()}" style="text-decoration: none; color: white ">Edit</a></button></td>
            <td><button type="button" class="btn btn-danger"><a href="/customer?action=delete&id=${customer.getId()}" style="text-decoration: none; color: white" >Delete</a></button></td>
        </tr>
        </c:forEach>
        </tbody>
</table>
<button type="button" class="btn btn-danger" style="display: inline-block">
    <a style="text-decoration:none;color: white; " id="create" href="/customer?action=create">Create New User</a>
</button>
<button type="button" class="btn btn-danger" style="display: inline-block">
    <a style="text-decoration:none;color: white; " id="home" href="/Admin">HomePage</a>
</button>
</body>
</html>
