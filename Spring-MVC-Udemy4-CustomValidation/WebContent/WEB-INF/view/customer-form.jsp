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
	<f:form action="processForm" modelAttribute="customer">
	Course Code: <f:input path="courseCode"/>
	<f:errors path="courseCode" cssClass="error"></f:errors>
	<br><br>
	Mobile Code: <f:input path="mobileCode"/>
	<f:errors path="mobileCode" cssClass="error"></f:errors>
	<br>
	<input type="submit">
	</f:form>
</body>
</html>