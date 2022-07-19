
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <script type="text/javascript" src="webjars/jquery/3.6.0/dist/jquery.min.js"></script>
</head>
<body>
<h2>List Customer</h2>
<form method="get" action="/product">
    <label for="search">Choose How To Search:</label>
    <select name="action" id="search">
        <option value="searchByName">Search By Name</option>
        <option value="searchByPrice">Search by Price</option>
        <option value="SearchById">Search By ID</option>
    </select>
    <input type="text" name="search" placeholder="Search">
    <button type="submit">Search</button>
</form>
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
            <th scope="row">${p.id}</th>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td>${p.quantity}</td>
            <td>${p.color}</td>
            <td>${p.description}</td>
            <td>${p.category}</td>
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
<button type="button" class="btn-danger"><a href="/product?action=soft" style="text-decoration:none;color: white; ">Soft By Name</a></button>
<!-- Button trigger modal -->
<%--<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">--%>
<%--    Launch demo modal--%>
<%--</button>--%>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                Are You Sure?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <a type="button" class="btn btn-primary btn-confirm-delete btn btn-danger" href="">Delete</a>
            </div>
        </div>
    </div>
</div>
<script>
    $(function () {
        $('.btn-delete').click(function () {
            let id = $(this).data("id");
            $('.btn-confirm-delete').attr("href", "/product?action=delete&id=" + id);
        })
    });
</script>
<%--<div class="modal" tabindex="-1" id="deleteUserModal">--%>
<%--    <div class="modal-dialog">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h5 class="modal-title">Modal title</h5>--%>
<%--                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">--%>
<%--                <p>Modal body text goes here.</p>--%>
<%--            </div>--%>
<%--            <div class="modal-footer">--%>
<%--                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>--%>
<%--                <button type="button" class="btn btn-primary">Save changes</button>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/popper.js/2.9.3/umd/popper.js"></script>
</body>
</html>
