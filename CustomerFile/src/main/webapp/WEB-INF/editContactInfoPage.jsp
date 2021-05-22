<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Contact Info</title>
<link href="<c:url value="/resources/css/mainCss.css" />" rel="stylesheet">
</head>
<body>
<div class="adminResults-sidebar">

</div>

<div class="adminResults-main">
<h1>${cust.lastName}, ${cust.firstName}</h1>


<form action="saveNewContactInfo">
<input type="hidden" value="${cust.firstName}" name="targetedClient">

<div class="editContactInfo-phoneNumberWrapper">
<p>${invalidPhone}</p>
<label>Area Code:</label>
<input type="text" value="${cust.phoneAreaCode}" name="newPhoneAreaCode">
<label>Number:</label>
<input type="text" value="${cust.phoneNumber}" name="newPhoneNumber">
</div>

<div>
<label>E-mail:</label>
<p>${invalidEmail}</p>
<input type="text" value="${cust.email}" name="newEmail">
</div>

<div class ="editingSubmit">
<input type="submit" value="Save">
</div>

</form>
<form action="cancelEdit">
<input type="hidden" value= "${cust.firstName}" name="targetedClient">

<div class="editingCancel">
<input type="submit" value="Cancel">
</div>
</form>

</div>
</body>
</html>