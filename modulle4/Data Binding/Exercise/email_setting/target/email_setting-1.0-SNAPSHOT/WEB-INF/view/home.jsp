<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="user" method="post" modelAttribute="email">
<table>
    <tr>
        <td><form:label path="languages">Language</form:label> </td>
        <td><form:select path="languages" >
            <form:option value="Engliss" label="English"></form:option>
            <form:option value="Vietnamese" label="Vietnamese"></form:option>
            <form:option value="China" label="China"></form:option>
            <form:option value="Korea" label="Korea"></form:option>
        </form:select>
        </td>
    </tr>
    <tr>
        <td><form:label path="pageSize">Page Size: </form:label></td>
        <td>Show <form:select path="pageSize">
            <form:option value="15" label="15"/>
            <form:option value="25" label="25"/>
            <form:option value="50" label="50"/>
            <form:option value="100" label="100"/>
        </form:select> emails per page</td>
    </tr>
    <tr>
        <td><form:label path="spamsFilter">Spams filter: </form:label></td>
        <td><form:checkbox path="spamsFilter" value="true"/> Enable spams filter</td>
    </tr>
    <tr>
        <td><form:label path="signature">Signature: </form:label></td>
        <td><form:textarea path="signature"/></td>
    </tr>
    <tr>
        <td><form:button>Save</form:button></td>
    </tr>
</table>
</form:form>
</body>
</html>
