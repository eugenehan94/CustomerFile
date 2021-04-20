<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client Search</title>
<link href="<c:url value="/resources/css/mainCss.css" />" rel="stylesheet">
</head>
<body>
<div class="adminMain-container">

	<div class="adminMain-search-wrapper">

	<div class="adminMain-search1">
	<h2>Client seach by name</h2>
	
	<form action="searchByName">
		<div class="adminMain-search1-form">
		<label>Firstname: </label> <input type="text" name="firstName" required>

		<label>Lastname: </label> <input type="text" name="lastName">
		<input type="submit" value="Search">
		</div>
	</form>
	
	<div class="signUp-cancel-btn">
	<a href="cancelSignUp">Cancel</a>
	</div>
	</div>


	<div class="adminMain-search2">
	<h2>Search by Phone Number</h2>
	
	<form action="searchByPhoneNumber">
		<div class="adminMain-search2-form">
		<label>Area code:</label>
		<input type="number" name="phoneAreaCode" min="001" max="999" placeholder="Area Code" required>
		<label>Number:</label>
		<input type="number" name="phoneNumber" placeholder="Number" required> 
		
		
		<input type="submit" value="Search">
		</div>
	</form>
	<div class="signUp-cancel-btn">
	<a href="cancelSignUp">Cancel</a>
	</div>
	</div>
	
	
	</div>
</div>
</body>
</html>