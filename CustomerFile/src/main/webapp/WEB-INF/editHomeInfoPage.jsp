<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomeInfoEditPage</title>
</head>
<body>
<h1> ${cust.firstName}, Looks like it works </h1>
<p>Here is the home address: ${cust.homeAddress}</p>

<form action="saveNewHomeInfo">
<input type="hidden" value="${cust.firstName}" name="targetedClient">
<input type="text" value="${cust.homeAddress}" name= "newHomeAddress">
<input type="submit" value="Save">
</form>
<form action="cancelEdit">
<input type="hidden" value= "${cust.firstName}" name="targetedClient">
<input type="submit" value="cancel">
</form>
</body>
</html>