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
    <title>Product</title>
</head>
<body>
<h1>Product Detail</h1>
<form>
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
</form>
</body>
</html>
