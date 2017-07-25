<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
  <title>Update_tasks</title>
</head>
<body>

<div>
  <h3> Update assigned tasks status here </h3>

  <form:form name="updatetaskform" action="updatetask" method="POST" modelAttribute="updatetaskBean">
    <table border="0" align="centre">
      <tbody>

      <tr>
        <td>Task Number</td>
        <td><form:input path = "taskNo" /></td>
      </tr>

      <!-- <tr>
        <select name='tasks'>
          <c:forEach var="list" items="${listCat}">
            <option id="${list.key}" value="${list.value.getTaskNo()}">${list.value.getTaskNo()}</option>
          </c:forEach>
        </select>
      </tr>
      -->
      <%--<tr>--%>
      <%--<form:select path="status">--%>
        <%--<form:option value="NONE" label="Select"/>--%>
        <%--<form:options items="${statusList}" />--%>
      <%--</form:select>--%>
      <%--</tr>--%>

      <tr>
        <td>Status</td>
        <td><form:input path = "taskStatus" /></td>
      </tr>

      <td></td>
      <td></td>
      </tr>
      <tr>
        <td><input type="button" name="home" style=" float: left" value="Back" onclick="history.go(-1);"></td>
        <td><input type="submit" style=" float: right" value="Update" name="submit"/>
          <input type="reset" style=" float: right" value="Clear" name="reset"/></td>
      </tr>
      </tbody>
    </table>
  </form:form>
</div>
</body>
</html>