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
    <title>Delete Product</title>
</head>
<body>
<h1>Are you sure?</h1>
<form method="post">
    <label>Id</label>
    <p>
        ${product.getId()}
    </p>
    <label>Name</label>
    <p>
        ${product.getName()}
    </p>
    <label>Price</label>
    <p>
        ${product.getPrice()}
    </p>
    <label>Description</label>
    <p>
        ${product.getDescription()}
    </p>
    <button type="submit">Delete</button>
</form>
<button type="button">
    <a href="/product">Back To List Product</a>
</button>
</body>
</html>
