<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Personal Info</title>
</head>
<body>

<h1>${cust.firstName}</h1>
<p>DOB: ${cust.dayOfBirth} ${cust.monthOfBirth} ${cust.yearOfBirth} </p>

<form action ="saveNewPersonalInfo">
<input type="hidden" value= "${cust.firstName}" name="targetedClient">
<input type="number" value="${cust.dayOfBirth}" name="newDayOfBirth">
	<select name="newMonthOfBirth">
			<option value="January" label="January" />
			<option value="February" label="February" />
			<option value="March" label="March" />
			<option value="April" label="April" />
			<option value="May" label="May" />
			<option value="June" label="June" />
			<option value="July" label="July" />
			<option value="August" label="August" />
			<option value="September" label="September" />
			<option value="October" label="October" />
			<option value="November" label="November" />
			<option value="December" label="December" />
		</select>
<input type="number" value="${cust.yearOfBirth}" name="newYearOfBirth">
<input type="submit" value="Save">
</form>

<form action="cancelEdit">
<input type="hidden" value= "${cust.firstName}" name="targetedClient">
<input type="submit" value="cancel">
</form>



</body>
</html>