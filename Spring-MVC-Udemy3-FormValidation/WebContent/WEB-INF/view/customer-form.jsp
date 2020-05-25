<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registeration Form</title>
	<style type="text/css">
		.error { color: red}
	</style>
</head>
<body>
	<h3 style="color: purple;">Fill out the form... (*) means the field is required</h3>
	<br><br>
	<f:form action="processForm" modelAttribute="customer">
	First Name: <f:input path="firstName"/>
	<br>
	Last Name (*): <f:input path="lastName"/>
				<f:errors path="lastName" cssClass="error"></f:errors> <!-- this error message will be shown once the form is submited and if there is an error -->
	
	<br><br>
	<input type="submit">
	</f:form>
</body>
</html>