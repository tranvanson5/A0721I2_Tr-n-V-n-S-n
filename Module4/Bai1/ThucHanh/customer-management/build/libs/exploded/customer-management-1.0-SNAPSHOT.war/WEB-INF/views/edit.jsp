<%--
  Created by IntelliJ IDEA.
  User: Son
  Date: 22/04/2022
  Time: 8:17 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
    <form action="/save" method="post">
        <table>
            <tr>
                <td></td>
                <td><input></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input></td>
            </tr>
            <tr>
                <td>Adrress</td>
                <td><input></td>
            </tr>
        </table>
        <button type="submit">Update</button>
    </form>
</body>
</html>
