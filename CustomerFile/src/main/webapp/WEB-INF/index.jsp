<!-- The home page went options are cancelled -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link href="<c:url value="/resources/css/mainCss.css" />"
	rel="stylesheet">
<title>Home</title>

</head>
<body class="homePage">
	<!-- The main page of application -->
	
		
	<div class="homePage-container">
		
		<div class="homPage-header">
		<h1>You deserve the best</h1>
		<h2>Over 800,000 client information stored!</h2>
		<h3>Start registering and storing your client data </h3>
		</div>
		
		
		<div class="homePage-btn-container">
			<a href="signUpLink" id="signUpBtn">New client</a> <a
				href="clientSearch" id="clientSearchBtn">Search</a>
		</div>
	
	</div>
</body>
</html>
