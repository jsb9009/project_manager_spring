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
</div>
    <div class="form-group">
        <form:form name="employeeform" action="addemployee" method="POST" modelAttribute="employee">
            <table border="0" align="center">
                <tbody>
                <tr>
                    <td>Employee Number</td>
                    <td><form:input required="required" class="form-control" path="empId"/></td>
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
                <tr>
                    <td colspan="5">&nbsp;</td>
                </tr>

                <tr>
                    <td>Username</td>
                    <td><form:input required="required" class="form-control" path="username"/></td>
                </tr>
                <tr>
                    <td colspan="5">&nbsp;</td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><form:password required="required" class="form-control" path="password"/></td>
                </tr>
                <tr>
                    <td colspan="5">&nbsp;</td>
                </tr>

                <tr>
                    <td>Authentication Level</td>
                    <td><form:select path="authinticationLevel" class="form-control"  data-toggle="dropdown" style="width:220px;">
                        <form:option value="0" label="--Select--"/>
                        <form:options items="${authenticationList}"/>
                    </form:select></td>

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
                    <td><input type="button" class="btn btn-primary" name="home" style=" float: left" value="Back"
                               onclick="history.go(-1);"></td>
                    <td><input type="submit" class="btn btn-success" style=" float: right" value="Add" name="submit"/>
                        <input type="reset" class="btn btn-primary" style=" float: right" value="Clear" name="reset"/>
                    </td>
                </tr>
                </tbody>
            </table>
        </form:form>
    </div>
    <c:if test="${not empty sucessMsg}">
        <h4 class="alert alert-success" style="width: 900px">${sucessMsg}</h4>
    </c:if>

<br>
<h3><span class="label label-info">Existing employee are..</span></h3>
<table border="1" class="table table-bordered table-hover" style="width: auto;" align="centre">
    <tr>
        <th>Employee Id</th>
        <th>Employee Name</th>
        <th>Position</th>
        <th>Authentication Level</th>

    </tr>
    <c:forEach items="${employeeList}" var="employee">
        <tr>
            <td>${employee.empId}</td>
            <td>${employee.empName}</td>
            <td>${employee.position}</td>
            <td>${employee.authinticationLevel}</td>
            <th><a href="deleteEmployee?id=<c:out value='${employee.id}'/>">Delete</a></th>
        </tr>
    </c:forEach>
</table>


<td><input onclick="location.href = 'go_to_manager_direct';"  type="button" class="btn btn-primary" name="home" style=" float: left" value="Back to Home"></td>
</body>
</html>

