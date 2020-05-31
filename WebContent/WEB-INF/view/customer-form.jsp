<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Customer</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>

</head>
<body>
   <div id="wrapper">
     <div id="header">
     	<h2>CRM-Customer Relationship Manager</h2>
     
     
     </div>
     <div id="container">
     	<h3>Save Customer</h3>
     	
     	<form:form action="saveCustomer" modelAttribute="customer" method="post">
     		<table>
     			<tbody>
     				<tr>
     				<form:hidden path="id"/>
     				 <td><label>First name:</label></td>
     				 <td><form:input path ="firstName"/></td>
     				</tr>
     				<tr>
     				 <td><label>Last name:</label></td>
     				 <td><form:input path ="lastName"/></td>
     				</tr>
     				<tr>
     				 <td><label>Email:</label></td>
     				 <td><form:input path ="email"/></td>
     				</tr>
     				<tr>
     				 <td><label></label></td>
     				 <td><input type="submit" value="Save" class="save"/></td>
     				 <td><label></label></td>
     				 <>
     				</tr>
     		 
     			
     			
     			</tbody>
     		
     		
     		</table>
     	
     	</form:form>
     
     
     </div>
   
   
   </div>

</body>
</html>