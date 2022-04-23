<%--
  Created by IntelliJ IDEA.
  User: Son
  Date: 23/04/2022
  Time: 11:25 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Convert</title>
  </head>
  <body>
  <form method="post" >
    <input type="number" placeholder="USD" name="USD">
    <br>
    <button type="submit">Convert</button>
  </form>
  <p>${VND}</p>
  </body>
</html>
