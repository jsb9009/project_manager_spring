<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Add_employees</title>
</head>
<body>

<div>
  <h3> Add Employees here </h3>

  <form:form name="employeeform" action="addemployee" method="POST" modelAttribute="employeeBean">
    <table border="0">
      <tbody>
      <tr>
        <td>Employee Number</td>
        <td><form:input path = "empNo" /></td>
      </tr>
      <tr>
        <td>Employee Name</td>
        <td><form:input path = "empName" /></td>
      </tr>
      <tr>
        <td>Position</td>
        <td><form:input path = "position" /></td>
      </tr>

      <td></td>
      <td></td>
      </tr>
      <tr>
        <td><input type="button" name="home" style=" float: left" value="Back" onclick="history.go(-1);"></td>
        <td><input type="submit" style=" float: right" value="Add" name="submit"/>
          <input type="reset" style=" float: right" value="Clear" name="reset"/></td>
      </tr>
      </tbody>
    </table>
  </form:form>


  <c:if test="${not empty sucessMsg}">
    <h4 class="error message" style="width: 900px">${sucessMsg}</h4>
  </c:if>


</div>
</body>
</html>

