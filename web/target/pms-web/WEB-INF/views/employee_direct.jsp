<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Employee Direct</title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
</head>

<body>

<h1><span class="label label-default">Welcome Employee..</span></h1>

<br>
<br>


<div class="container" align="center">

    <ul class="nav nav-pills nav-stacked">
        <li class="active" style="font-size:25px;"><a href="update_tasks">Update assigned tasks status</a></li>
        <li class="active" style="font-size:25px;"><a href="view_assigned_tasks_list">View assigned tasks</a></li>

    </ul>

    <br>
    <br>

    <td><input type="button" class="btn btn-primary" name="home" style=" float: right" value="Log Out" onclick="history.go(-1);"></td>
</div>
</body>

</html>

