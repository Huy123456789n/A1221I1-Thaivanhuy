
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Information Product</h2>
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
</tr>
</thead>
<tbody>
    <tr>
        <th scope="row">${product.getId()}</th>
        <td>${product.getName()}</td>
        <td>${product.getPrice()}</td>
        <td>${product.getQuantity()}</td>
        <td>${product.getColor()}</td>
        <td>${product.getDescription()}</td>
        <td>${product.getCategory()}</td>
    </tr>
</tbody>
</table>
<h2>Form Update</h2>
<form method="post" style="width: 30%">
    <label>Name</label>
    <input type="text" class="form-control" name="name" placeholder="Enter Name">
    <label>Price</label>
    <input type="text" class="form-control" name="price" placeholder="Enter Name">
    <label>Quantity</label>
    <input type="text" class="form-control" name="quantity" placeholder="Enter Name">
    <label>Color</label>
    <input type="text" class="form-control" name="color" placeholder="Enter Name">
    <label>Description</label>
    <input type="text" class="form-control" name="description" placeholder="Enter Name">
    <label for="search">Choose How To Category :</label>
    <select name="category" id="search">
        <c:forEach items="${category}" var="e">
            <option value="${e.idCategory}" >${e.nameCategory}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Submit" class="btn btn-danger">
</form>
</body>
</html>
