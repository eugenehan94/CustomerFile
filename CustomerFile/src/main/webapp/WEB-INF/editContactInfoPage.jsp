<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Contact Info</title>
</head>
<body>

<h1>${cust.firstName}, </h1>
<p>Here is the contact info: </p>
<p>Phone Number: ${cust.phoneAreaCode} ${cust.phoneNumber} </p>
<p>Email: ${cust.email }</p>

<form action="saveNewContactInfo">
<input type="hidden" value=${cust.firstName} name="targetedClient">
<input type="text" value="${cust.phoneAreaCode}" name="newPhoneAreaCode">
<input type="text" value="${cust.phoneNumber}" name="newPhoneNumber">
<input type="text" value="${cust.email}" name="newEmail">
<input type="submit" value="Save">
</form>
<form action="cancelEdit">
<input type="hidden" value= "${cust.firstName}" name="targetedClient">
<input type="submit" value="cancel">
</form>

</body>
</html>