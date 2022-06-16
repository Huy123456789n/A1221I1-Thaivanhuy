<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
Map<String, String> dic = new HashMap<>();
%>
<%
    dic.put("hello" , "Xin chào");
    dic.put("how" , "Thế nào");
    dic.put("What" , "Cái Gì");
    dic.put("information" , "Thông tin");
    String search = request.getParameter("search");
    String result = dic.get(search);
    if(result != null) {
        out.println("Word: " + search);
        out.println("Result: " + result);
    } else {
        out.println("Not Found");
    }
%>

</body>
</html>
