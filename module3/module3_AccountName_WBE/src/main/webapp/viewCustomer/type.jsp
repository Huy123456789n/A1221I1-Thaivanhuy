<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/23/2022
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer</h1>
<c:forEach items="${customer}" var="customer" >
    <p><c:out value="${customer}"></c:out></p>
</c:forEach>
</body>
</html>
