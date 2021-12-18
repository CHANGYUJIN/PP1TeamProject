<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>view</title>
	<link href="${pageContext.request.contextPath}/resources/form.css" rel="stylesheet">
</head>
<body>
<table id="edit">
		<tr>
			<td>RC</td><td>${view.RC}</td>
		</tr>
		<tr>
			<td>Room #</td><td>${view.roomnum}</td>
		</tr>
		<tr>
			<td>User ID</td><td>${view.userID}</td>
		</tr>
		<tr>
			<td>Name</td><td>${view.name}</td>
		</tr>
		<tr>
			<td>Temperature</td><td>${view.temp}</td>
		</tr>
		<tr>
			<td>Photo</td><td><c:if test="${view.filename ne ''}"><br />
			<img src="${pageContext.request.contextPath}/resources/img/${view.filename}" class="photo"></c:if></td>
		</tr>
</table>
	<button type="button" onclick="history.back()">Previous Page</button>
</body>
</html>