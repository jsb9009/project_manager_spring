<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 2:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome</title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
    <style>
        body {
            background-image: url(<c:url value="/images/bb.png"/>);
        }
    </style>

</head>
<body>
<div class="container">
    <div class="page-header" style=" float: right">
        <h1>Project Management System</h1>
        <p style=" float: right">Simply manage your tasks..</p>
    </div>

</div>
<br>
<br>
<br>

<div class="container">

    <h1><span class="label label-primary" style=" float: right" style="color:#000000;"><a href="login">Login Here</a></span></h1>


</div>


<%--<br>--%>
    <%--<ul class="nav nav-pills nav-justified">--%>
        <%--<li class="active" style="font-size:25px;" style=" float: right"><a href="login">Login</a></li>--%>
    <%--</ul>--%>
</body>

</html>
