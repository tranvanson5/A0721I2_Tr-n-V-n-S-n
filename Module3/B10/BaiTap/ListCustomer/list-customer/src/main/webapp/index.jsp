<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: drive
  Date: 12/01/2022
  Time: 11:59 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table  border="1" align="center">
    <caption><h2>Danh sách khách hàng</h2></caption>
    <tr>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach items="${customerList}" var="c">
      <tr>
        <td>${c.getName()}</td>
        <td>${c.getDate()}</td>
        <td>${c.getAddress()}</td>
        <td><img src="${c.getUrlImg()}" style="width: 160px"></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
