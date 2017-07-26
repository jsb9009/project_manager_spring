<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Employee Direct</title>
</head>

<body>

<h3>Welcome ${username}</h3>

<br>
<br>

<div align="center">
    <a href="update_tasks">Update assigned tasks status</a>
    <br>
    <br>
    <a href="view_assigned_tasks_list">View assigned tasks</a>

    <br>
    <br>

    <td><input type="button" name="home" style=" float: left" value="Log Out" onclick="history.go(-1);"></td>
</div>
</body>

</html>

