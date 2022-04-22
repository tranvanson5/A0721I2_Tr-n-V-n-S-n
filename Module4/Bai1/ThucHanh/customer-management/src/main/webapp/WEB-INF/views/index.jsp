<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>List</title>
</head>
<body>
<h2>List Customer</h2>
<a href="/create">Create</a>
<table border="1">
  <tr>
    <td>Id</td>
    <td>Name</td>
    <td>Email</td>
    <td>Address</td>
    <td></td>
  </tr>
  <c:forEach items="${list}" var="lists">
    <tr>
      <td>${lists.id}</td>
      <td>${lists.name}</td>
      <td>${lists.email}</td>
      <td>${lists.address}</td>
      <td>
        <a>Delete</a>
        <a>Edit</a>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
