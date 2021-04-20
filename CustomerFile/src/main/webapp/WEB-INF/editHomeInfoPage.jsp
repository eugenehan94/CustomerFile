<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomeInfoEditPage</title>
<link href="<c:url value="/resources/css/mainCss.css" />" rel="stylesheet">
</head>
<body>
<div class="adminResults-sidebar">

</div>

<div class="adminResults-main">
<h1> ${cust.firstName}, Looks like it works </h1>
<p>Here is the home address: ${cust.homeAddress}</p>

<form action="saveNewHomeInfo">
<input type="hidden" value="${cust.firstName}" name="targetedClient">
<input type="text" value="${cust.homeAddress}" name= "newHomeAddress">
<input type="submit" value="Save">
</form>
<form action="cancelEdit">
<input type="hidden" value= "${cust.firstName}" name="targetedClient">
<input type="submit" value="cancel">
</form>
</div>

</body>
</html>