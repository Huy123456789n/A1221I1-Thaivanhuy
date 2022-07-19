
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous">
<html>
<head>
    <title>Insert Customer</title>
</head>
<body>
<h2>Information Customer</h2>
<form method="post">
    <%--   <div style="width: 30vw;height: 150px">--%>
    <%--   <table>--%>
    <%--    <div class="input-group mb-3">--%>
        <div style="width: 300px; ">
    <label>Name :</label>
    <input type="text" class="form-control" name="name" placeholder="Enter Name">
    <label>Date :</label>
    <input type="text" class="form-control" name="date" placeholder="Enter Date Of Birth">
    <label>Gender :</label>
    <input type="text" class="form-control" name="gender" placeholder="Enter Gender">
    <label>CMND :</label>
    <input type="text" class="form-control" name="cmnd" placeholder="Enter CMND">
    <label>Email :</label>
    <input type="text" class="form-control" name="email" placeholder="Enter Email">
    <label>Address :</label>
    <input type="text" class="form-control" name="address" placeholder="Enter Address">
    <label>Type Customer :</label>
    <input type="text" class="form-control" name="type" placeholder="Enter Type Customer">
    <label>Phone Number :</label>
    <input type="text" class="form-control" name="sdt" placeholder="Enter Phone Number">
        </div>
    <%--    </div>--%>
    <%--    </table>--%>
    <%--    </div>--%>
    <input type="submit" value="Submit" class="btn btn-danger">
</form>
<button type="button" class="btn btn-danger">
    <a href="/customer" style="text-decoration: none; color: white">Back To List Customer</a>
</button>
</body>
</html>
