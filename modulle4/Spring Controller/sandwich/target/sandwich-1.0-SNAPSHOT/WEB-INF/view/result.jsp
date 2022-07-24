<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 7/20/2022
  Time: 8:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${condiment}" var="a">
    ${a}
</c:forEach>
</body>
</html>
