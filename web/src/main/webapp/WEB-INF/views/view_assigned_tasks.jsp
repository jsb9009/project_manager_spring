<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
</head>
<body>
<div>
    <h3><span class="label label-info">Your assigned tasks are..</span></h3>
    <table border="1" class="table table-bordered table-hover" style="width: auto;" align="centre">
        <tr>
            <th>Task Number</th>
            <th>Task Name</th>
            <th>Number of Hours</th>
            <th>Project</th>
        </tr>
        <c:forEach items="${tasksList1}" var="task">
            <tr>
                <td>${task.taskId}</td>
                <td>${task.taskName}</td>
                <td>${task.noOfHours}</td>
                <td>${task.project.projectId}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <br>
    <input type="button" name="home" class="btn btn-primary" value="Back" onclick="history.go(-1);">
</div>
</body>
</html>
