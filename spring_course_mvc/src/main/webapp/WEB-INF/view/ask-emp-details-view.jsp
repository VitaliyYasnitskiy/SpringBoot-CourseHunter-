<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Dear employee ? Please enter your details</h2>
<br>
<br>
<%--@elvariable id="employee" type=""--%>
<form:form action = "showDetails" modelAttribute="employee">
    Name <form:input path = "name"/>
    <br><br>
    Surname <form:input path = "surname"/>
        <br><br>
    Salary <form:input path="salary"/>
<br><br>
    Department <form:select path="department">
   <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>

    <input type="submit" value="OK">
</form:form>


</body>
</html>
