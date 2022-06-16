<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/15/2022
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
float rate = Float.parseFloat(request.getParameter("rate"));
float usd = Float.parseFloat(request.getParameter("usd"));
float vnd = rate * usd;
%>
<h1>Rate : <%=rate%></h1>
<h1>Usd : <%=usd%></h1>
<h1>Vnd : <%=vnd%></h1>
</body>
</html>
