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

<form action ="saveNewPersonalInfo">

<input type="hidden" value= "${cust.firstName}" name="targetedClient">

<div class="editPersonal-dateOfBirth">
<label>Date of Birth:</label>
<select name="newDayOfBirth">
<option value="${cust.dayOfBirth}" selected>${cust.dayOfBirth}</option>
<c:forEach items="${dayList}" var="dayList">
<c:if test ="${dayList != cust.dayOfBirth}">
	<option value="${dayList}">${dayList}</option>
</c:if>
</c:forEach>
</select>

	
	<select name="newMonthOfBirth">
			<option value="${cust.monthOfBirth}" selected> ${cust.monthOfBirth}</option>
			<c:forEach items="${monthList}" var="monthList">
        		<c:if test ="${monthList != cust.monthOfBirth}">	
        		<option value="${monthList}">${monthList}</option>
    			</c:if>
    		</c:forEach>
						
		</select> 

</div>

<div>
<label>Year of Birth:</label>		
<select name="newYearOfBirth">
<option value="${cust.yearOfBirth}" selected> ${cust.yearOfBirth}</option>
<c:forEach items="${yearList}" var="yearList">
	<c:if test = "${yearList != cust.yearOfBirth}">
	<option value="${yearList}">${yearList}</option>
	</c:if>
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