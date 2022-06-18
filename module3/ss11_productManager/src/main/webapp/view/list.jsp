
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <style>
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>
<h1>List Product</h1>
<table class="table table-success table-striped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Description</th>
            <th scope="col">Edit</th>
            <th scope="col">Delete</th>
        </tr>
        </thead>
        <c:forEach items="${product}" var = "product">
        <tbody>
        <tr>
            <th scope="row">${product.getId()}</th>
            <td><a href="/product?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td><button type="button" class="btn btn-warning"><a href="/product?action=update&id=${product.getId()}" style="text-decoration: none">Edit</a></button></td>
            <td><button type="button" class="btn btn-danger"><a href="/product?action=delete&id=${product.getId()}" style="text-decoration: none">Delete</a></button></td>
        </tr>
        </tbody>
        </c:forEach>
</table>
<button type="button">
    <a id="create" href="/product?action=create">Create New Product</a>
</button>
<button type="button">
    <a id="search" href="/product?action=search">Search Product By Name</a>
</button>


    <!-- Button trigger modal -->
    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
        Create New Product
    </button>
    <form methods="post" action ="/product?action=create">
    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Create New Product</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <div class="input-group mb-3">
                        <input type="text" class="form-control" aria-label="Text input with checkbox" name="name" placeholder="Enter Name">
                    </div>
                    <div class="input-group mb-3">
                        <input type="text" class="form-control" aria-label="Text input with checkbox" name="price" placeholder="Enter Price">
                    </div> <div class="input-group mb-3">
                    <input type="text" class="form-control" aria-label="Text input with checkbox" name="description" placeholder="Enter Description">
                </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Save Changes</button>
                </div>
            </div>
        </div>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>
</body>
</html>
