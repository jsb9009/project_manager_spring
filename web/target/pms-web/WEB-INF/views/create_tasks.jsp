<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Create_tasks</title>
</head>
<body>

<div>
    <h3> Create tasks here </h3>

    <form:form name="taskform" action="createtask" method="POST" modelAttribute="taskBean">

        <table border="0" align="center">
            <tbody>


            <tr>
                <td>Project Number</td>
                <td><form:input path="project_no"/></td>
            </tr>
            <!--   <tr>
        <select name='projects'>
          <c:forEach var="list" items="${listCat}">
            <option id="${list.key}" value="${list.value.getProjectName()}">${list.value.getProjectName()}</option>
          </c:forEach>
        </select>
      </tr>
-->

            <tr>
                <td>Task Number</td>
                <td><form:input path="task_no"/></td>
            </tr>
            <tr>
                <td>Task Name</td>
                <td><form:input path="task_name"/></td>
            </tr>
            <tr>
                <td>Status</td>
                <td><form:input path="status"/></td>
            </tr>
            <tr>
            <tr>
                <td>Number of hours</td>
                <td><form:input path="no_of_hours"/></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td><input type="button" name="home" style=" float: left" value="Back" onclick="history.go(-1);"></td>
                <td><input type="submit" style=" float: right" value="Create" name="submit"/>
                    <input type="reset" style=" float: right" value="Clear" name="reset"/></td>
            </tr>
            </tbody>
        </table>
    </form:form>
</div>
</body>
</html>

