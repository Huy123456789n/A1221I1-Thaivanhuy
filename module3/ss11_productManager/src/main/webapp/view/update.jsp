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
    <title>Update Product</title>
</head>
<body>
<h1>Update Product</h1>
<form method="post">
    <label>Name</label>
    <input type="text" name="name" placeholder="Enter New Name">
    <label>Price</label>
    <input type="text" name="price" placeholder="Enter New Price">
    <label>Description</label>
    <input type="text" name="description" placeholder="Enter Description">
    <button type="submit">Update</button>
</form>
<button type="button">
    <a href="/product">Back To List Product</a>
</button>
</body>
</html>
