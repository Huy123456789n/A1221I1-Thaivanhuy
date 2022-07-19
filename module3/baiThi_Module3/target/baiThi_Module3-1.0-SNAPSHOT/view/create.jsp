
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
<html>
<head>
    <title>Title</title>
    <link href="validate.js">
</head>
<body>
<script language="javascript" src="validate.js"></script>
<form method="post" style="width: 30%">
    <label>Name</label>
    <input type="text" class="form-control" name="name" id="name" placeholder="Enter Name">
    <label>Price</label>
    <input type="text" class="form-control" name="price" placeholder="Enter Name">
    <label>Quantity</label>
    <input type="text" class="form-control" name="quantity" placeholder="Enter Name">
    <label>Color</label>
    <input type="text" class="form-control" name="color" placeholder="Enter Name">
    <label>Description</label>
    <input type="text" class="form-control" name="description" placeholder="Enter Name">
    <label>Category</label>
    <%--<input type="text" class="form-control" name="category" placeholder="Enter Name">--%>
    <label >Choose How To Category :</label>
    <select name="category" >
        <c:forEach items="${category}" var="e">
            <option value="${e.category_id}" >${e.category_name}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Submit" class="btn btn-danger" >
</form>
</body>
</html>
