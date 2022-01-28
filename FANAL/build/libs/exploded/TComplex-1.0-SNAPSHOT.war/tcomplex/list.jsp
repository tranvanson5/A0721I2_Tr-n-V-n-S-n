<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: drive
  Date: 26/01/2022
  Time: 6:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/tcomplex?action=create&id=${l.id}">Create</a>
<table border="1px">
    <caption>List</caption>
    <tr>
        <th>
            id
        </th>
        <th>
            area
        </th>
        <th>
            status
        </th>
        <th>
            floor
        </th>
        <th>
            type
        </th>
        <th>
            description
        </th>
        <th>
            price
        </th>
        <th>
            date start
        </th>
        <th>
            date end
        </th>
    </tr>
    <c:forEach items="${list}" var="l">
        <tr>
            <td><c:out value="${l.id}"/></td>
            <td><c:out value="${l.area}"/></td>
            <td><c:out value="${l.status}"/></td>
            <td><c:out value="${l.floor}"/></td>
            <td><c:out value="${l.type}"/></td>
            <td><c:out value="${l.description}"/></td>
            <td><c:out value="${l.price}"/></td>
            <td><c:out value="${l.date_start}"/></td>
            <td><c:out value="${l.date_end}"/></td>
            <td>
                <a href="/tcomplex?action=edit&id=${l.id}">Edit</a>
                <a href="/tcomplex?action=delete&id=${l.id}" onclick="confirmdelete()">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<script language="javascript">
    function confirmdelete(){
        confirm("bạn có muốn xoá không");
    }
</script>
</body>
</html>
