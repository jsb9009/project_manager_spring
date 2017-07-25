<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>

    <style type="text/css">

    </style>
</head>

<body>

<h1>I am in Login</h1>

<form:form method="POST" name="loginsubmit" action="loginin"
           modelAttribute="loginBean">
    <table align="center">
        <tr>
            <td>User Name</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><form:password path="password"/></td>

        </tr>
        <tr>
            <td><input type="submit" value="Log In"/></td>
        </tr>

    </table>
</form:form>

</body>

</html>
