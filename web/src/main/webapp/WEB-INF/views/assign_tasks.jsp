<%--
  Created by IntelliJ IDEA.
  User: jaliya
  Date: 7/19/17
  Time: 4:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Assign_tasks</title>
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"/>
</head>
<body>

<div>
    <h3><span class="label label-info">Assign the tasks here</span></h3>

    <div class="form-group">
    <form:form name="assigntaskform" action="assigntask" method="POST" modelAttribute="assignBean">
        <table border="0" align="center">
            <tbody>

            <tr>
                <td>Employee Number</td>
                <td><form:input class="form-control" path="empNo"/></td>
                <%--<form:select  path="empNo">--%>
                    <%--<form:option value="NONE"> --SELECT--</form:option>--%>
                    <%--<form:options items="${listOfInstitutionsNames}"></form:options>--%>
                <%--</form:select>--%>
            </tr>

            <!-- <tr>
        <select name='projects'>
          <c:forEach var="list" items="${listCat}">
            <option id="${list.key}" value="${list.value.getProjectName()}">${list.value.getProjectName()}</option>
          </c:forEach>
        </select>
      </tr>
      -->


            <tr>
                <td>Task Number</td>
                <td><form:input class="form-control" path="taskNo"/></td>
            </tr>

            <!-- <tr>
        <select name='projects'>
          <c:forEach var="list" items="${listCat}">
            <option id="${list.key}" value="${list.value.getProjectName()}">${list.value.getProjectName()}</option>
          </c:forEach>
        </select>
      </tr>
      -->

            <td></td>
            <td></td>
            </tr>
            <tr>
                <td><input type="button" class="btn btn-primary" name="home" style=" float: left" value="Back" onclick="history.go(-1);"></td>
                <td><input type="submit" class="btn btn-success" style=" float: right" value="Assign" name="submit"/>
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


