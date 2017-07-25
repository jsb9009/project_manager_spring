<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>

<table border="1" align="centre">
  <tr>
    <th>Task Number</th>
    <th>Task Name</th>
    <th>Status</th>
    <th>Project</th>
    <th>Employee Number</th>

  </tr>

  <c:forEach items="${tasksList}" var="viewtasksBean">
    <tr>
      <td>${viewtasksBean.task_no}</td>
      <td>${viewtasksBean.task_name}</td>
      <td>${viewtasksBean.status}</td>
      <td>${viewtasksBean.projectNo}</td>
      <td>${viewtasksBean.empNo}</td>
    </tr>

  </c:forEach>

</table>

<input type="button" name="home" value="Back"  onclick="history.go(-1);">
</body>
</html>
