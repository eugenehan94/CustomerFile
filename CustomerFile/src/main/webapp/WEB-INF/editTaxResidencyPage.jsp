<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Tax Residency</title>
<link href="<c:url value="/resources/css/mainCss.css" />" rel="stylesheet">
</head>
<body>
<div class="adminResults-sidebar">

</div>
<div class="adminResults-main">
	<h1>${cust.lastName}, ${cust.firstName}</h1>

	<h2>Canadian tax resident: ${cust.canadianTaxRes} </h2>
	<h2>US tax resident: ${cust.usTaxRes} </h2>
	<h2>Other tax resident: ${cust.otherTaxRes}</h2>

	<form action="saveNewTaxRes">
		<input type="hidden" value="${cust.firstName}" name="targetedClient">
		<div class="editTaxRes-Canadian">
		<label>Are you a Canadian tax resident?</label> <select
			name="newCanadianTaxRes" >
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
		</select>
		</div>
		
		<div class="editTaxRes-US">
		<label>Are you a US tax resident?</label> <select name="newUSTaxRes">
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
		</select> 
		</div>
		
		<div class="editTaxRes-Other">
		<label>Are you a tax resident of other countries?</label> 
		<select
			name="newOtherTaxRes">
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
			
		</select> 
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