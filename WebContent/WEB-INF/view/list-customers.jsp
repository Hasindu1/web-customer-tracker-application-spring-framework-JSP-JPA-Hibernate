<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"></link>
</head>
<body>
<div id="wrapper">
	<div id="header">
		<h2>CRM-Customer Relationship Manager</h2>
	
	</div>
	<div id="container">
		<div id="content">
		
		<!--put a new nutton Add customer-->
		
		<input type=button" value="Add Customer"
		 onclick="window.location.href='showFormForAdd';return false;"
		 class="add-button"
		 />
			<table>
			
			<tr>
			  <th>First Name</th>
			  <th>Last Name</th>
			   <th>Email</th>
			</tr>   
			
			<c:forEach var="tempCustomer" items="${customers}">
			
			<c:url var="updatedurl" value="/customer/showFormForUpdate">
			<c:param name="id" value="${tempCustomer.id}"/>
			</c:url>
				
			<c:url var="deleteurl" value="/customer/deleteCustomer">
			<c:param name="id" value="${tempCustomer.id}"></c:param>
			</c:url>
			
			
			
			<tr>
				<td>${tempCustomer.firstName}</td>
				<td>${tempCustomer.lastName}</td>
				<td>${tempCustomer.email}</td>
				<td><a href="${updatedurl}">Update</a></td>
				<td><a href="${deleteurl}">Delete</a> 
			</tr>
			
			</c:forEach>
			
			</table>
		</div>
	
	</div>

</div>

</body>
</html>