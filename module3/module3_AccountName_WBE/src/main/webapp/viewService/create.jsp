<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/22/2022
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous">
<html>
<head>
    <title>Insert Service</title>
</head>
<body>
<h2>Information Customer</h2>
<form method="post">
    <%--   <div style="width: 30vw;height: 150px">--%>
    <%--   <table>--%>
    <%--    <div class="input-group mb-3">--%>
    <div style="width: 300px; ">
        <label>ID :</label>
        <input type="text" class="form-control" name="id" placeholder="Enter ID">
        <label>Name :</label>
        <input type="text" class="form-control" name="name" placeholder="Enter Name">
        <label>Area :</label>
        <input type="text" class="form-control" name="area" placeholder="Enter Area">
        <label>Service Cost :</label>
        <input type="text" class="form-control" name="cost" placeholder="Enter Service Cost">
        <label>Max People :</label>
        <input type="text" class="form-control" name="maxPeople" placeholder="Max People">
        <label>Rent Type ID :</label>
        <input type="text" class="form-control" name="rentType" placeholder="Rent Type ID">
        <label>Service Type ID :</label>
        <input type="text" class="form-control" name="serviceType" placeholder="Service Type ID">
        <label>Standard Room :</label>
        <input type="text" class="form-control" name="standardRoom" placeholder="Enter Standard Room">
        <label>Description :</label>
        <input type="text" class="form-control" name="description" placeholder="Enter Description">
        <label>Pool Area :</label>
        <input type="text" class="form-control" name="pool" placeholder="Enter Pool Area">
        <label>Number Of Floors :</label>
        <input type="text" class="form-control" name="floors" placeholder="Enter Number Of Floors">
    </div>
    <input type="submit" value="Submit" class="btn btn-danger">
</form>
<button type="button" class="btn btn-danger">
    <a href="/service" style="text-decoration: none; color: white">Back To List </a>
</button>
</body>
</html>
