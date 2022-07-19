
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
        <th scope="col">Price</th>
        <th scope="col">Quantity</th>
        <th scope="col">Color</th>
        <th scope="col">Description</th>
        <th scope="col">Cate Gory</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${product}" var="p">
        <tr>
            <th scope="row"><c:out value="${p.getId()}"></c:out></th>
            <td><c:out value="${p.getName()}"></c:out></td>
            <td><c:out value="${p.getPrice()}"></c:out></td>
            <td><c:out value="${p.getQuantity()}"></c:out></td>
            <td><c:out value="${p.getColor()}"></c:out></td>
            <td><c:out value="${p.getDescription()}"></c:out></td>
            <td><c:out value="${p.getCategory()}"></c:out></td>
            <td><button type="button" class="btn btn-warning"><a href="/product?action=update&id=${p.getId()}" style="text-decoration: none; color: white ">Edit</a></button></td>
                <%--            <td><button type="button" class="btn btn-danger"><a class="btn btn-danger btn-delete" data-toggle="modal" data-id="${product.id}"--%>
                <%--                                                                data-target="#deleteUserModal" href="" type="button">Delete</a></button></td>--%>
            <td> <button type="button" class="btn btn-danger btn-delete" data-id="${p.id}" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Delete </button> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button type="button" class="btn btn-danger" style="display: inline-block">
    <a style="text-decoration:none;color: white; " id="create" href="/product?action=create">Create New Product</a>
</button>
<button type="button" class="btn btn-danger" style="display: inline-block">
    <a style="text-decoration:none;color: white; " id="home" href="/Admin">HomePage</a>
</button>
</body>
</html>
