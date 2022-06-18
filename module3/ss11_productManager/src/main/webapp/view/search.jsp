<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/16/2022
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Product</title>
</head>
<body>
<form method="post">
    <label>Search Product</label>
    <input type="text" name="search" placeholder="Enter Name Product">
    <button type="submit">Search</button>
</form>
<form >
    <label>ID</label>
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
</form>
<button type="button">
    <a href="/product"> Back To List Product</a>
</button>

</body>
</html>
