<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Returned results will show here</h1>

<h2> ${cust.lastName}, ${cust.firstName}</h2>

<a href="adminSearch">Client Search</a>


<h3>Personal Info</h3> 
<form action ="editPersonalInfo">
<input type="submit" value="Edit">
<input type="hidden" value="${cust.firstName}" name="targetClient">
</form>
<p>DOB (D/M/Y): ${cust.dayOfBirth} ${cust.monthOfBirth} ${cust.yearOfBirth} </p>

<h3>Home Address</h3> 
<form action="editHomeInfo">
<input type="submit" value="Edit">
<input type ="hidden" value="${cust.firstName}" name="targetClient">
</form>
<p>Address: ${cust.homeAddress}</p>


<h3>Contact Info</h3> 
<form action = "editContactInfo">
<input type="submit" value="Edit">
<input type ="hidden" value="${cust.firstName}" name="targetClient">
</form> 
<p>Phone number: ${cust.phoneAreaCode} ${cust.phoneNumber}</p>
<p>Email: ${cust.email}</p>
 
<h3>Tax Residency Info</h3> 
<form action = "editTaxResidency">
<input type="hidden" value="${cust.firstName}" name="targetClient">
<input type="submit" value="Edit">
</form>
</body>
</html>