<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/13/2022
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
  <h2>Money Convert</h2>
<form method="post" action="/convert">
  <label>Rate</label><br/>
  <input type="text" name="Rate" placeholder="Rate" value="20000"> <br/>
  <label>Usd</label><br/>
  <input type="text" name="Usd" placeholder="Usd" value="0"><br/>
  <button type="submit">Convert</button>
</form>
  </body>
</html>
