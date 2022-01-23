<%--
  Created by IntelliJ IDEA.
  User: drive
  Date: 31/12/2021
  Time: 7:08 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="\discount" method="post">
    <label>Product Description:</label><br>
    <input type="text" name="Description"><br>
    <label>List Price:</label><br>
    <input name="Price" type="number"><br>
    <label>Discount Percent:</label><br>
    <input type="number" name="Discount"><br>
    <button type="submit" id="submit">submit</button>
  </form>
  </body>
</html>
