<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/16/2022
  Time: 9:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Product</title>
    <style>
        div{
            display: block;
        }
        input{
            display: block;
            margin-bottom: 20px;
        }
    </style>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
<h1>Product Information</h1>
<form method="post">
    <div class="modal" tabindex="-1">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <p>Modal body text goes here.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </div>
    <!-- Button trigger modal -->
    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
        Launch demo modal
    </button>

    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    ...
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </div>
<%--    <div class="modal" tabindex="-1">--%>
<%--        <div class="modal-dialog">--%>
<%--            <div class="modal-content">--%>
<%--                <div class="modal-header">--%>
<%--                    <h5 class="modal-title">Modal title</h5>--%>
<%--                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                </div>--%>
<%--                <div class="modal-body">--%>
<%--                        <label>Name</label>--%>
<%--                        <input type="text" name="name" placeholder="Enter Name">--%>
<%--                        <label>Price</label>--%>
<%--                        <input type="text" name="price" placeholder="Enter Price">--%>
<%--                        <label>Description</label>--%>
<%--                        <input type="text" name="description" placeholder="Enter Description">--%>
<%--                </div>--%>
<%--                <div class="modal-footer">--%>
<%--                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>--%>
<%--                    <button type="button" class="btn btn-primary">Save changes</button>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
</form>
    <!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>
</body>
</html>
