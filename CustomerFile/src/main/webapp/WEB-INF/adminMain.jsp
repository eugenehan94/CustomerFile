<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Admin</h1>

	<h2>Client seach by name</h2>
	<form action="searchByName">

		<label>Firstname: </label> <input type="text" name="firstName">

		<label>Lastname: </label> <input type="text" name="lastName">
		<input type="submit" value="Search">
	</form>

	<h2>Search by Phone Number</h2>
	<form action="searchByPhoneNumber">
		<input type="number" name="phoneAreaCode" min="001" max="999">
		<input type="number" name="phoneNumber"> <input type="submit"
			value="Search">
	</form>
	<a href="cancelSignUp">Cancel</a>
</body>
</html>