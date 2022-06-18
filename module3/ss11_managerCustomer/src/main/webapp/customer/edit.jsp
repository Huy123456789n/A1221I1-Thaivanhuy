
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Customer</h1>
<p>
    <a href="/customer">Back to Customer</a>
</p>
<form method="post">
    <fieldset>
        <legend>Edit Customer</legend>
       <table>
           <tr>
               <td>Name</td>
               <td>
                   <input type="text" name="name">
               </td>
           </tr>
           <tr>
               <td>Email</td>
               <td>
                   <input type="text" name="email">
               </td>
           </tr>
           <tr>
               <td>Address</td>
               <td>
                   <input type="text" name="address">
               </td>
           </tr>
           <tr>
               <td></td>
               <td>
                   <button type="submit">Submit</button>
               </td>
           </tr>
       </table>
    </fieldset>
</form>
</body>
</html>
