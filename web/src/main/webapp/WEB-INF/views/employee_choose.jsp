<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/24/17
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
  <title>Choose_employee</title>
</head>
<body>

<div>
  <h3> Choose your employee number here </h3>

  <form:form name="chooseempform" action="view_assigned_tasks" method="POST" modelAttribute="employeenumberBean">
    <table border="0" align="center">
      <tbody>

      <tr>
        <td>Employee Number</td>
        <td><form:input path = "emp_no" /></td>
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

      <td></td>
      <td></td>
      </tr>
      <tr>
        <td><input type="button" name="home" style=" float: left" value="Back" onclick="history.go(-1);"></td>
        <td><input type="submit" style=" float: right" value="Next" name="submit"/>
          <input type="reset" style=" float: right" value="Clear" name="reset"/></td>
      </tr>
      </tbody>
    </table>
  </form:form>
</div>
</body>
</html>
