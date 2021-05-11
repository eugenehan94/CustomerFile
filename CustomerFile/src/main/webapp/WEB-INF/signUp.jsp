<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
	


	<Form action="SignUp" id="signUp-formID">
	
	<div class = "signUpPage-LeftSideWrapper">
		<h1>Sign Up Page</h1>
		<div class="signUp-header-underline"></div>
		
		 <p id ="inputResults">${sucessMessage}</p>
		
		<div class="signUp-name">
		<h3>Personal Information</h3>
			<label id="label-css">First name:</label> 
			<p id ="inputResults">${FirstNameResult}</p>
			<input type="text" name="firstName" value="${firstName}" >
			
			<label>Last name: </label> 
			<p id ="inputResults">${LastNameResult}</p>
			<input type="text" name="lastName" value="${lastName}">
			
		</div>
		 

		
		<div class="signUp-address">
			<label>Residential Address:</label> 
			<p id ="inputResults">${AddressResult}</p>
			<input type="text"
				name="address" value="${homeAddress}">
				
		</div>
		
	

		<div class="signUp-email">
				<label>E-mail:</label> 
				<p id ="inputResults">${EmailResult}</p>
				<input type="text" name="email" value="${email}">
				
		</div>
			
			<div class="signUp-phoneNumber">
				<br>
				<label>Phone number:</label> 
				<p id ="inputResults">${AreaCodeResult}</p>
				<br>
				<input type="number" name="phoneAreaCode" placeholder=" Area code" id="areaCodeBox" value="${phoneAreaCode}"> 
				
				<input type="number" name="phoneNumber" placeholder="Number" id="phoneNumberBox" value="${phoneNumber}"> 
				
			</div>
			
			
			
			
			<div class="signUp-DOB">
			<label>Date of Birth:</label> 
			<br>
		<select name="day">
		<option value="${dayOfBirth}" selected>${dayOfBirth}</option>		
		<c:forEach items="${dayList}" var="dayList">
			<c:if test ="${dayList != dayOfBirth}">
			<option value="${dayList}">${dayList}</option>
			</c:if>	
		</c:forEach>
		</select>

		<select name="month">
		<option value="${monthOfBirth}" selected>${monthOfBirth}</option>
			<c:forEach items="${monthList}" var="monthList">
        		<c:if test ="${monthList != monthOfBirth}">
        		<option value="${monthList}">${monthList}</option>
    			</c:if>
    		</c:forEach>				
		</select> 
		
		<select name ="year">
		<option value="${yearOfBirth}" selected>${yearOfBirth}</option>
		<c:forEach items="${yearList}" var ="yearList">
			<c:if test ="${yearList != yearOfBirth}">	
			<option value="${yearList}">${yearList}</option>
			</c:if>
		</c:forEach>
		</select>	
		</div>
		
		
		
	</div>	
	
	<div class = "signUpPage-RightSideWrapper">
	
		<div class="signUp-taxRes">
		<h3>Tax Residency info</h3>
		<p id ="inputResults">${TaxResResult}</p>
		<br> <label>Are you a Canadian tax resident</label> 
		<select
			name="canadianTaxResident">
			<option value="" label=""/>
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
		</select> <label>Are you a US tax resident</label> <select name="USTaxResident">
			<option value="" label=""/>
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
		</select> <label>Are you a tax resident of other countries</label> <select
			name="OtherTaxResident">
			<option value="" label=""/>
			<option value="Yes" label="Yes" />
			<option value="No" label="No" />
		</select> 
		</div>
		
		<div class="signUp-submit">
		<input type="submit" value="Submit">
		</div>
		<div class = "signUp-cancel">
		<a href = "cancelSignUp" id="signUpCancel">Cancel</a>
		</div>
		
	</div>	
	</Form>
		
		</div>
		</div>
		
		
</body>
</html>