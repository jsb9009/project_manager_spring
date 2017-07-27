<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/24/17
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Choose_employee</title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
</head>
<body>

<div>
    <h3><span class="label label-info">Choose your employee number here</span></h3>

    <div class="form-group">
    <form:form name="chooseempform" action="view_assigned_tasks" method="POST" modelAttribute="employeenumberBean">
        <table border="0" align="center">
            <tbody>

            <tr>
                <td>Employee Number</td>
                <td><form:input class="form-control" path="emp_no"/></td>
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
                <td><input type="button" class="btn btn-primary" name="home" style=" float: left" value="Back" onclick="history.go(-1);"></td>
                <td><input type="submit" class="btn btn-success" style=" float: right" value="Next" name="submit"/>
                    <input type="reset" class="btn btn-primary" style=" float: right" value="Clear" name="reset"/></td>
            </tr>
            </tbody>
        </table>
    </form:form>
        </div>
</div>
</body>
</html>
