<%--
  Created by IntelliJ IDEA.
  User: Son
  Date: 22/04/2022
  Time: 8:17 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
    <form action="/save" method="post">
        <table>
            <tr>
                <td><input type="hidden" name="id" value="<%=customer.getId() %>"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <td>Adrress</td>
                <td><input type="text" name="address"></td>
            </tr>
        </table>
        <button type="submit">Save</button>
    </form>
</body>
</html>
