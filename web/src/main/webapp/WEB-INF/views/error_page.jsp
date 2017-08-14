<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/26/17
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Error</title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
</head>
<body>

<h2><span class="label label-danger">Error occured!!! Try again later.</span></h2>

<br>
<h4>${msg}</h4>
<br>
<br>
<input type="button" class="btn btn-primary" name="home" value="Back" onclick="history.go(-1);">
</body>
</html>




