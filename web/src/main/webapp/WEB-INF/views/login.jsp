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
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
    <style>
        body {
            background-image: url(<c:url value="/images/bb.png"/>);
        }
    </style>
</head>

<div class="container">
    <div class="page-header" style=" float: right">
        <h1>Project Management System</h1>

        <p style=" float: right">Simply manage your tasks..</p>
    </div>
</div>

<div style=" float: right">
    <form:form method="POST" name="loginsubmit" action="loginin"
               modelAttribute="employee">
        <div class="form-group">
            <table align="center">
                <tr>
                    <td>User Name</td>
                    <td><form:input required="required" class="form-control" path="username"/></td>
                </tr>
                <tr>
                    <td colspan="5">&nbsp;</td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><form:password required="required" class="form-control" path="password"/></td>

                </tr>

                <tr>
                    <td colspan="5">&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td><input class="btn btn-primary" float="right" type="submit" value="Log In"/></td>
                </tr>

            </table>
        </div>
    </form:form>

</div>
</body>

</html>
