<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Tasks</title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
</head>
<body>


<div>
    <h3><span class="label label-info">The tasks assigned for employees are..</span></h3>


    <table border="1" class="table table-striped" align="centre">
        <tr>
            <th>Task Number</th>
            <th>Task Name</th>
            <th>Status</th>
            <th>Project</th>
            <th>Employee Number</th>

        </tr>

        <c:forEach items="${tasksList}" var="task">
            <tr>
                <td>${task.taskId}</td>
                <td>${task.taskName}</td>
                <td>${task.status}</td>
                <td>${task.project.projectId}</td>
                <td>${task.employee.empId}</td>
            </tr>

        </c:forEach>

    </table>
    <br>
    <br>
    <input type="button" name="home" class="btn btn-primary" value="Back" onclick="history.go(-1);">
</div>
</body>
</html>
