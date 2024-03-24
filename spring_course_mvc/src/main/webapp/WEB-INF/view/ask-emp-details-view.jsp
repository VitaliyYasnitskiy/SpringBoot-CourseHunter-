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
    Which car do you want?
<%--    BMW <form:radiobutton path="carBrand" value = "BMW"/>--%>
<%--    Audi <form:radiobutton path="carBrand" value = "Audi"/>--%>
<%--    MB <form:radiobutton path="carBrand" value = "Mercedes-Benz"/>--%>

    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

<%--    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>--%>

<%--    <br><br>--%>
<%--    Foreign Language(s)?--%>
<%--    <form:checkbox path="languages" items="${employee.languageList}"/>--%>
<%--    <br><br>--%>

        <br><br>
        Phone number <form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/>

        <br><br>

    <input type="submit" value="OK">
</form:form>


</body>
</html>
