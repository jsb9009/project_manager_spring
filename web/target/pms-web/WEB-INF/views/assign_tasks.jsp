<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 4:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Assign_tasks</title>
</head>
<body>

<div>
    <h3> Assign tasks here </h3>

    <form:form name="assigntaskform" action="assigntask" method="POST" modelAttribute="assignBean">
        <table border="0" align="center">
            <tbody>

            <tr>
                <td>Employee Number</td>
                <td><form:input path="empNo"/></td>
            </tr>

            <!-- <tr>
        <select name='projects'>
          <c:forEach var="list" items="${listCat}">
            <option id="${list.key}" value="${list.value.getProjectName()}">${list.value.getProjectName()}</option>
          </c:forEach>
        </select>
      </tr>
      -->
            <tr>
                <td>Task Number</td>
                <td><form:input path="taskNo"/></td>
            </tr>

            <!-- <tr>
        <select name='projects'>
          <c:forEach var="list" items="${listCat}">
            <option id="${list.key}" value="${list.value.getProjectName()}">${list.value.getProjectName()}</option>
          </c:forEach>
        </select>
      </tr>
      -->

            <td></td>
            <td></td>
            </tr>
            <tr>
                <td><input type="button" name="home" style=" float: left" value="Back" onclick="history.go(-1);"></td>
                <td><input type="submit" style=" float: right" value="Assign" name="submit"/>
                    <input type="reset" style=" float: right" value="Clear" name="reset"/></td>
            </tr>
            </tbody>
        </table>
    </form:form>
</div>
</body>
</html>


