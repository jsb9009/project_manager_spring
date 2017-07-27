<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Manager Direct</title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
</head>

<body>

<h1><span class="label label-default">Welcome Manager..</span></h1>

<br>
<br>



<div class="container" align="center">

    <ul class="nav nav-pills nav-stacked">
        <li class="active" style="font-size:25px;"><a href="add_employees">Add employees to the workstation</a></li>
        <li class="active" style="font-size:25px;"><a href="add_projects">Add projects</a></li>

    </ul>

    <br>
    <br>
    <td><input type="button" class="btn btn-primary" name="home" style=" float: right" value="Log Out" onclick="history.go(-1);"></td>
</div>

</body>

</html>
