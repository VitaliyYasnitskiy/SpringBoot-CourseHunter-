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
    <form:errors path ="name"/>

    <br><br>
    SurName <form:input path = "surname"/>
    <form:errors path ="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path ="salary"/>

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

    <br><br>

    Foreign Languages (s)
<%--    EN <form:checkbox path="languages" value = "English"/>--%>
<%--    DE <form:checkbox path="languages" value = "Deutch"/>--%>
<%--    FR <form:checkbox path="languages" value = "Franch"/>--%>


    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>
    Phone Number <form:input path = "phoneNumber"/>
    <form:errors path ="phoneNumber"/>
    <br><br>


    <br><br>
    Email <form:input path = "email"/>
    <form:errors path ="email"/>
    <br><br>



    <input type="submit" value="OK">
</form:form>


</body>
</html>
