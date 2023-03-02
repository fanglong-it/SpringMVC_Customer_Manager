<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Customer Manager</h1>
	<form action="search" method="get">
		<input type="text" name="keyword" />  <input type="submit"
			value="Search" />
	</form>

	<a href="${pageContext.request.contextPath}/new">New Customer</a>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>E-mail</th>
			<th>Address</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${listCustomer}" var="customer">
			<tr>
				<td>${customer.id}</td>
				<td>${customer.name}</td>
				<td>${customer.email}</td>
				<td>${customer.address}</td>
				<td><a href="${pageContext.request.contextPath}/edit?id=${customer.id}">Edit</a>
					&nbsp;&nbsp;&nbsp; <a href="${pageContext.request.contextPath}/delete?id=${customer.id}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>



</body>
</html>