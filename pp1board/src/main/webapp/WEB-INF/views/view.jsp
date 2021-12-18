<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>view</title>
	<link rel="stylesheet" href="form.css">
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
			<td>Photo</td><td><c:if test="${view.filename ne ''}"><br />
			<img src="<%=request.getContextPath() %>/img/${view.filename}" class="photo"></c:if></td>
		</tr>
</table>
	<button type="button" onclick="history.back()">Previous Page</button>
	<button type="button" onclick="location.href='add'">Add New Post</button>
</body>
</html>