<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/mainCss.css" />" rel="stylesheet">
<title>Insert title here</title>

</head>
<body class = "signUpPage">
	<div class="signUp-container">
	<div class="signUp-form">
	<h1>Sign Up Page</h1>


	<Form action="SignUp">
		<h2>Personal Information</h2>
		
		<div class="signUp-name">
		<label>Firstname:</label> <input type="text" name="firstName" required>
		<label>Lastname: </label> <input type="text" name="lastName" required>
		</div>
		 
		<div class="signUp-DOB">
		<label>Date of Birth:</label> <input
			type="number" name="day" value="1" min="1" max="31"> <input
			type="number" name="year" value="1900" min="1900" max="2021">
		<select name="month">
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
		</div>
		
		<div class="signUp-address">
		<label>Residential Address:</label> <input type="text"
			name="address">
		</div>
		
		<div class="signUp-phoneNumber">
			<label>Phone number:</label> <input
			type="number" name="phoneAreaCode" placeholder=" Area code"> <input
			type="number" name="phoneNumber" placeholder="Number"> <br>
		</div>

		<div class="signUp-email">
		<label>E-mail:</label> <input type="text" name="email"> <br>
		</div>
		
		<div class="signUp-taxRes">
		<h2>Tax Residency info</h2>
		<br> <label>Are you a Canadian tax resident</label> <select
			name="canadianTaxResident">
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
		</select> <label>Are you a US tax resident</label> <select name="USTaxResident">
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
		</select> <label>Are you a tax resident of other countries</label> <select
			name="OtherTaxResident">
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
		</select> 
		</div>
		
		<div class="signUp-submit">
		<input type="submit" value="Submit">
		</div>
		
	</Form>
		<div class = "signUp-cancel">
		<a href = "cancelSignUp" id="signUpCancel">Cancel</a>
		</div>
	
	
	
		</div>
		</div>
		
		
</body>
</html>