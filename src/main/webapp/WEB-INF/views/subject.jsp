<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<%@page isELIgnored="false"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>date</th>
				<th>description</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="sub" varStatus="counter" items="${subject}">
				<tr>
					<td>${counter.count}</td>
					<td>${sub.name}</td>
					<td>${sub.dateCreate}</td>
					<td>${sub.description}</td>
					<td></td>

				</tr>
			</c:forEach>

		</tbody>


	</table>
</body>
</html>