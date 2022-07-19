
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
<%--Thanh Tìm Kiếm--%>
<form method="get" action="/room">
    <label for="search">Choose How To Search:</label>
    <select name="action" id="search">
        <option value="search">Search By Name</option>
        <option value="searchByPrice">Search by Phone Number</option>
        <option value="SearchById">Search By ID</option>
    </select>
    <input type="text" name="search" placeholder="Search">
    <button type="submit">Search</button>
</form>
<%--Table list--%>
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Phone Number</th>
        <th scope="col">Star Day</th>
        <th scope="col">Pay type</th>
        <th scope="col">Description</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
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
            <td>
                <button type="button" class="btn btn-warning"><a href="/room?action=update&id=${p.id}" style="text-decoration: none; color: white ">Edit</a>
                </button>
            </td>
            <td>
                <button type="button" class="btn btn-danger"><a href="/room?action=delete&id=${p.id}"
                                                                 style="text-decoration: none; color: white ">Delete</a>
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button type="button" class="btn btn-danger" style="display: inline-block">
    <a style="text-decoration:none;color: white; " id="create" href="/room?action=create">Create</a>
</button>
<button type="button" class="btn btn-danger" style="display: inline-block">
    <a style="text-decoration:none;color: white; " id="home" href="/Admin">HomePage</a>
</button>
</body>
</html>
