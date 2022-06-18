<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/16/2022
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
 <form method="post" action="/calculatorServlet">
   <input type="number" placeholder="Enter Number" name="number">
   <select name="select">
     <option name="add">Addition</option>
     <option name="sub">Subtraction</option>
     <option name="mul">multiplication</option>
     <option name="div">Division</option>
   </select>
   <input type="number" placeholder="Enter Number2" name="number2">
   <button type="submit">Result</button>

 </form>
  </body>
</html>
