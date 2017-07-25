<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title></title>
</head>
<body>

<table border="1">
  <tr>
    <th>Task Number</th>
    <th>Task Name</th>
    <th>Number of Hours</th>
    <th>Project</th>

  </tr>

  <c:forEach items="${assignedtaskList}" var="chooseemployeeBean">
    <tr>
      <td>${chooseemployeeBean.itemNumber}</td>
      <td>${chooseemployeeBean.itemName}</td>
      <td>${chooseemployeeBean.itemType}</td>
      <td>${chooseemployeeBean.itemType}</td>
    </tr>

  </c:forEach>

</table>

<input type="button" name="home" value="Back"  onclick="history.go(-1);">
</body>
</html>
