<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
  <title>Add_projects</title>
</head>
<body>

<div>
  <h3> Add projects here </h3>

  <form:form name="projectform" action="addproject" method="POST" modelAttribute="projectBean">
    <table border="0" align="center">
      <tbody>
      <tr>
        <td>Project Number</td>
        <td><form:input path = "projectNo" /></td>
      </tr>
    <tr>
    <td>Project Name</td>
    <td><form:input path = "projectName" /></td>
    </tr>
    <tr>
    <td>Client Name</td>
    <td><form:input path = "client" /></td>
    </tr>
      <tr>
        <td>Project Type</td>
        <td><form:input path = "type" /></td>
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
</div>
</body>
</html>

