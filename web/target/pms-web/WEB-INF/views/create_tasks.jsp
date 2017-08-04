<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create_tasks</title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
</head>
<body>

<div>
    <h3><span class="label label-info">Add new task details</span></h3>

    <div class="form-group">
    <form:form name="taskform" action="createtask" method="POST" modelAttribute="tasks">

        <table border="0" align="center">
            <tbody>


            <tr>
                <td>Project Number</td><td>&nbsp;</td>
                <td><form:select path="Projects.projectId" class="form-control" data-toggle="dropdown" style="width: 220px;">
                    <form:option value="NONE" label="--Select--"/>
                    <form:options items="${projectsList}" itemLabel="projectId" itemValue="projectId"/>
                </form:select></td>

            </tr>
                <td colspan="5">&nbsp;</td>
            </tr>
            <tr>
                <td>Task Number</td><td>&nbsp;</td>
                <td><form:input required="required" class="form-control" path="taskId"/></td>
            </tr>
            <tr>
                <td colspan="5">&nbsp;</td>
            </tr>
            <tr>
                <td>Task Name</td><td>&nbsp;</td>
                <td><form:input required="required" class="form-control" path="taskName"/></td>
            </tr>
            <tr>
                <td colspan="5">&nbsp;</td>
            </tr>
            <tr>
                <td>Status</td><td>&nbsp;</td>
                <td><form:select path="status" class="form-control" data-toggle="dropdown" style="width:220px;" >
                    <form:option value="NONE" label="--Select--"/>
                    <form:options items="${statusList}" />
                </form:select></td>

            </tr>
            <tr>
                <td colspan="5">&nbsp;</td>
            </tr>
            <tr>
            <tr>
                <td>Number of hours</td><td>&nbsp;</td>
                <td><form:input required="required" class="form-control" path="noOfHours"/></td>
            </tr>
            <tr>
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
                <td><input type="button" class="btn btn-primary" name="home" style=" float: left" value="Back" onclick="history.go(-1);"></td><td>&nbsp;</td>
                <td><input type="submit" class="btn btn-success" style=" float: right" value="Create" name="submit"/>
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

