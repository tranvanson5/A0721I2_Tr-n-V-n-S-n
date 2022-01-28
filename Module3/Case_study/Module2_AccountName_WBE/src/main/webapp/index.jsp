<%--
  Created by IntelliJ IDEA.
  User: drive
  Date: 24/01/2022
  Time: 1:34 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <style>
    body{
      margin: 0;
      padding: 0;
    }
    #header{
      height: 150px;
      width: 100%;
      border: solid 1px black;
    }
    #header1 {
      height: 100px;
      width: 100%;
      display: flex;
    }
    #header2 {
      height: 50px;
      width: 100%;
      border: solid 1px black;
      display: flex;
    }
    nav{
      width: 80%;
    }
    #header2 nav a{
      line-height: 50px;
      margin: 20px;
    }
    #search{
      line-height: 50px;
    }
    #boder{
      display: flex;
    }
    #boder1{
      width: 30%;
      height: 700px;
      border: solid 1px black;
    }
    #boder2{
      width: 70%;
      height: 700px;
      border: solid 1px black;
    }
    #footer{
      width: 100%;
      height: 100px;
      border: black solid 1px;
    }
  </style>
</head>
<body>
<div id="header">
  <div id="header1">
    <div class="logo" style="width: 80%">
      <img src="https://furamavietnam.com/wp-content/uploads/2018/08/logo@2x.png" style="height: 80px; width: 80px; margin: 10px">
    </div>
    <div class="user" style="margin: 20px">
      Nguyen Van A
    </div>

  </div>
  <div id="header2">
    <nav>
      <a href="#">Home</a> |
      <a href="#">Employee</a> |
      <a href="#">Customer</a> |
      <a href="#">Service</a> |
      <a href="#">Contract</a>
    </nav>
    <div id="search">
      <input type="text" placeholder="Search.." name="search">
      <button type="submit"><i class="fa fa-search"></i></button>
    </div>
  </div>
</div>
<div id="boder">
  <div id="boder1">
    <ul>
      <li><a href="#">Item One</a></li>
      <li><a href="#">Item Two</a></li>
      <li><a href="#">Item Three</a></li>
    </ul>
  </div>
  <div id="boder2"></div>
</div>
<div id="footer"></div>
</body>
</html>
