<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>

</head>

<h3><span class="label label-info">Please Login..</span></h3>

<form:form method="POST" name="loginsubmit" action="loginin"
           modelAttribute="loginBean">
<div class="form-group">
    <table align="center">
        <tr>
            <td>User Name</td>
            <td><form:input class="form-control" path="username"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><form:password class="form-control" path="password"/></td>

        </tr>
        <tr>&nbsp;<td></td></tr>
        <tr>&nbsp;<td></td></tr>
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td><input class="btn btn-primary" float="right" type="submit" value="Log In"/></td>
        </tr>

    </table>
    </div>
</form:form>

</body>

</html>
