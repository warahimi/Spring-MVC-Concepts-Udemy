<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation / Success Page</title>
</head>
<body>
<h1 align="center">Customer Confirmation / Success Page</h1>
<hr>
<br>
 The customer is confirmed : ${customer.firstName } ${customer.lastName } 
 <br>
 Free Passes: ${customer.freepasses}
 <br>
 <br>
 Postal Code: ${customer.postalCode}
 <br>
  
</body>
</html>