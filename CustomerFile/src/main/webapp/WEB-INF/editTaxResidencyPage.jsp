<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Tax Residency</title>
</head>
<body>

	<h1>${cust.firstName}</h1>
	<p>TaxRes: ${cust.canadianTaxRes} ${cust.usTaxRes}
		${cust.otherTaxRes}</p>

	<form action="saveNewTaxRes">
		<input type="hidden" value=${cust.firstName} name="targetedClient">
		<label>Are you a Canadian tax resident</label> <select
			name="newCanadianTaxRes" >
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
		</select> <label>Are you a US tax resident</label> <select name="newUSTaxRes" value="cust.usTaxRes">
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
		</select> <label>Are you a tax resident of other countries</label> <select
			name="newOtherTaxRes">
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
		</select> <input type="submit" value="Save">

	</form>
	
	<form action="cancelEdit">
<input type="hidden" value= "${cust.firstName}" name="targetedClient">
<input type="submit" value="cancel">
</form>
</body>
</html>