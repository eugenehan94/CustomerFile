<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Personal Info</title>
<link href="<c:url value="/resources/css/mainCss.css" />" rel="stylesheet">
</head>
<body>

<div class="adminResults-sidebar">

</div>

<div class="adminResults-main">
<h1>${cust.lastName}, ${cust.firstName}</h1>
<h2>Current DOB: ${cust.dayOfBirth} ${cust.monthOfBirth} ${cust.yearOfBirth} </h2>

<form action ="saveNewPersonalInfo">

<input type="hidden" value= "${cust.firstName}" name="targetedClient">

<div class="editPersonal-dateOfBirth">
<label>Date of Birth:</label>

<select name="newDayOfBirth">
<c:forEach items="${dayList}" var="dayList">
	<option value="${dayList}">${dayList}</option>
</c:forEach>
</select>
	
	<select name="newMonthOfBirth">
	
			<c:forEach items="${monthList}" var="monthList">
        		<option value="${monthList}">${monthList}</option>
    		</c:forEach>
						
		</select> 

</div>

<div>
<label>Year of Birth:</label>		

<select name="newYearOfBirth">
<c:forEach items="${yearList}" var="yearList">
	<option value="${yearList}">${yearList}</option>
</c:forEach>
</select>

</div>

<div class ="editingSubmit">
<input type="submit" value="Save">
</div>

</form>
<div class="editingCancel">
<form action="cancelEdit">
<input type="hidden" value= "${cust.firstName}" name="targetedClient">
<input type="submit" value="Cancel">
</form>
</div>

</div>
</body>
</html>