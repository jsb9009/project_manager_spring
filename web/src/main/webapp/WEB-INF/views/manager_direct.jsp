<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Manager Direct</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>

<body>

<h3>Welcome ${username}</h3>

<br>
<br>

<div align="center">
    <a href="add_employees">Add employees to the workstation</a>
    <br>
    <br>
    <br>
    <a href="add_projects">Add projects</a>
    <br>
    <br>
    <td><input type="button" name="home" style=" float: left" value="Log Out" onclick="history.go(-1);"></td>
</div>

</body>

</html>
