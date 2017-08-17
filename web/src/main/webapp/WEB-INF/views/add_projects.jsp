<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add_projects</title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
</head>
<body>

<div>
    <h3><span class="label label-info">Add new project details</span></h3>
    <div class="form-group">
        <form:form name="projectform" action="addproject" method="POST" modelAttribute="project">
            <table border="0" align="center">
                <tbody>
                <tr>
                    <td>Project Number</td>
                    <td><form:input required="required" class="form-control" path="projectId"/></td>
                </tr>
                <tr>
                    <td colspan="5">&nbsp;</td>
                </tr>
                <tr>
                    <td>Project Name</td>
                    <td><form:input required="required" class="form-control" path="projectName"/></td>
                </tr>
                <tr>
                    <td colspan="5">&nbsp;</td>
                </tr>
                <tr>
                    <td>Client Name</td>
                    <td><form:input required="required" class="form-control" path="client"/></td>
                </tr>
                <tr>
                    <td colspan="5">&nbsp;</td>
                </tr>
                <tr>
                    <td>Project Type</td>
                    <td><form:input required="required" class="form-control" path="projectType"/></td>
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
</div>

<h3><span class="label label-info">Existing projects are..</span></h3>
<table border="1" class="table table-bordered table-hover" style="width: auto;" align="centre">
    <tr>
        <th>Project Id</th>
        <th>Project Name</th>
        <th>Project Type</th>
        <th>Client</th>
    </tr>
    <c:forEach items="${projectList}" var="project">
        <tr>
            <td>${project.projectId}</td>
            <td>${project.projectName}</td>
            <td>${project.projectType}</td>
            <td>${project.client}</td>
            <th><a href="deleteProject?id=<c:out value='${project.id}'/>">Delete</a></th>
        </tr>
    </c:forEach>
</table>

<td><input onclick="location.href = 'go_to_manager_direct1';"  type="button" class="btn btn-primary"
           name="home" style=" float: left" value="Back to Home"></td>
</body>
</html>

