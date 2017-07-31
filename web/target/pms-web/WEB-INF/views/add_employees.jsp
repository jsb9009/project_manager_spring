<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add_employees</title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
</head>
<body>

<div>
    <h3><span class="label label-info">Add new employee details</span></h3>

    <div class="form-group">
    <form:form name="employeeform" action="addemployee" method="POST" modelAttribute="employeeBean">
        <table border="0" align="center">
            <tbody>
            <tr>
                <td>Employee Number</td>
                <td><form:input required="required" class="form-control" path="empNo"/></td>
            </tr>
            <tr>
                <td colspan="5">&nbsp;</td>
            </tr>
            <tr>
                <td>Employee Name</td>
                <td><form:input required="required" class="form-control" path="empName"/></td>
            </tr>
            <tr>
                <td colspan="5">&nbsp;</td>
            </tr>
            <tr>
                <td>Position</td>
                <td><form:input required="required" class="form-control" path="position"/></td>
            </tr>

            <td></td>
            <td></td>
            </tr>
            <tr>
                <td colspan="5">&nbsp;</td>
            </tr>
            <tr>
                <td colspan="5">&nbsp;</td>
            </tr>
            <tr>
                <td><input type="button" class="btn btn-primary" name="home" style=" float: left" value="Back" onclick="history.go(-1);"></td>
                <td><input type="submit" class="btn btn-success" style=" float: right" value="Add" name="submit"/>
                    <input type="reset" class="btn btn-primary" style=" float: right" value="Clear" name="reset"/></td>
            </tr>
            </tbody>
        </table>
    </form:form>
</div>
    <c:if test="${not empty sucessMsg}">
        <h4 class="alert alert-success" style="width: 900px">${sucessMsg}</h4>
    </c:if>

</div>
</body>
</html>

