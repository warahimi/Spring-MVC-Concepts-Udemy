<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- including the Spring Form tags -->
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<f:form action="processForm" modelAttribute="student">
		First Name: <f:input path="firstName" />
		<!-- Spring will call student.setFirstName() -->
		<br>
		<br>
		Last Name: <f:input path="lastName" />
		<br>
		<br>
		<%--
		Country:  
		<f:select path="country"> <!-- dropdown list -->
			<f:option value="Afg" label="Afghanistan"></f:option>
			<f:option value="Pak" label="Pakistan"></f:option>
			<f:option value="USA" label="USA"></f:option>
			<f:option value="In" label="India"></f:option>
		</f:select>
		--%>
		<%-- if we want to get/read the drop down data from a java class insetead of hardcoding it in our jsp page --%>

		Country:
		<f:select path="country">
			<f:options items="${student.countryOptionsHashMap }" />
		</f:select>
		<br><br>
		City:      <!-- reading values from a properties file -->
		<f:select path="city">
			<f:options items="${cityOptions }"/>
		</f:select>
		<br>
		Favorit Language:
		Java<f:radiobutton path="favoriteLanguage" value="Java"/> <!-- path="favoriteLangue" will bind our radiobutton with field name , it will call the student.setFavoriteLanguage() -->
		Python<f:radiobutton path="favoriteLanguage" value="Python"/>
		C#<f:radiobutton path="favoriteLanguage" value="C#"/>
		<br>
		Gender:
		<f:radiobuttons path="studentGender" items="${student.gender}"/>
		<br>
		Operating Systems:
		Linux <f:checkbox path="os" value="Linux"/>
		Mac <f:checkbox path="os" value="Mac"/>
		Windows <f:checkbox path="os" value="Windows"/>
		<br>
		<input type="submit" />
	</f:form>
</body>
</html>