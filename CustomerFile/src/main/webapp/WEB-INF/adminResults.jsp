<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/mainCss.css" />" rel="stylesheet">
</head>
<body>

<div class="adminResults-sidebar">

<a href="adminSearch">Client Search</a> <br>
<a href="signUpLink">New client</a>
</div>

<div class="adminResults-main">

<h1> ${cust.lastName}, ${cust.firstName}</h1>


<form action ="editPersonalInfo">

<div class="adminResults-headers">
<h3>Personal Info</h3> 
<input type="submit" value="Edit">
</div>

<input type="hidden" value="${cust.firstName}" name="targetClient">
</form>
<p>DOB (D/M/Y): ${cust.dayOfBirth} ${cust.monthOfBirth} ${cust.yearOfBirth} </p>


<form action="editHomeInfo">
<div class="adminResults-headers">
<h3>Home Address</h3> 
<input type="submit" value="Edit">

</div>
<input type ="hidden" value="${cust.firstName}" name="targetClient">
</form>
<p>Address: ${cust.homeAddress}</p>



<form action = "editContactInfo">

<div class="adminResults-headers">
<h3>Contact Info</h3> 
<input type="submit" value="Edit">
</div>

<input type ="hidden" value="${cust.firstName}" name="targetClient">
</form> 
<p>Phone number: ${cust.phoneAreaCode} ${cust.phoneNumber}</p>
<p>Email: ${cust.email}</p>
 

<form action = "editTaxResidency">
<div class="adminResults-headers">
<h3>Tax Residency Info</h3> 
<input type="submit" value="Edit">
</div>
<input type="hidden" value="${cust.firstName}" name="targetClient">
</form>


</div>

</body>
</html>