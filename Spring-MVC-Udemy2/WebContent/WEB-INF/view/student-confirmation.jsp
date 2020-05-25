<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation form</title>
</head>
<body>
	<h1 align="center">Student confirmation form</h1>
	<hr>
	The student is confirmed: ${student.firstName} ${student.lastName} <!-- calling student.getfirstName and student.getLastName -->
	<br>
	Country: ${student.country}  
	<br>
	City: ${student.city} 
	<br>
	Favorite Languguage: ${student.favoriteLanguage}
	<br>
	Gender: ${student.studentGender}
	
	<!-- reading the data from Array os , coming from checkboxes we need to loop over it, we use the jstl foreach -->
	Operating System:
	<ul>
		<c:forEach var="temp" items="${student.os }">
			<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>