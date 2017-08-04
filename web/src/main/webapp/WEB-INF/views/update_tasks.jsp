<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update_tasks</title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
</head>
<body>

<div>
    <h3><span class="label label-info">Update the task status here</span></h3>

    <div class="form-group">
    <form:form name="updatetaskform" action="updatetask" method="POST" modelAttribute="tasks">
        <table border="0" align="center">
            <tbody>

            <tr>
                <td>Task Number</td><td>&nbsp;</td>
                <td><form:select path="taskId" class="form-control" data-toggle="dropdown" style="width: 220px;">
                    <form:option value="NONE" label="--Select--"/>
                    <form:options items="${tasksList}" itemLabel="taskId" itemValue="taskId"/>
                </form:select></td>

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

            <td></td>
            <td></td>
            <tr>
                <td colspan="5">&nbsp;</td>
            </tr>
            <tr>
                <td colspan="5">&nbsp;</td>
            </tr>
            <tr>
                <td><input type="button" class="btn btn-primary" name="home" style=" float: left" value="Back" onclick="history.go(-1);"></td><td>&nbsp;</td>
                <td><input type="submit" class="btn btn-success" style=" float: right" value="Update" name="submit"/>
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