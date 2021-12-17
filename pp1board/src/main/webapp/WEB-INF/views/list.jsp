<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>실전프로젝트1</title>
	<link rel="stylesheet" href="form.css">
</head>
<body>
<h1>Dorm Roll-call</h1>
<table id="list" width="90%">
<tr>
	<th>Post ID</th>
	<th>RC</th>
	<th>Room Number</th>
	<th>Name</th>
	<th>RegDate</th>
	<th>Edit</th>
	<th>Delete</th>
</tr>
<c:forEach items="${list}" var="u">
	<tr>
		<td>${u.seq}</td>
		<td>${u.RC}</td>
		<td>${u.roomnum}</td>
		<td>${u.name}</td>
		<td>${u.regdate}</td>
		<td><a href="editform/${u.seq}">Edit</a></td>
		<td><a href="javascript:delete_ok('${u.seq}')">Delete</a></td>
	</tr>
</c:forEach>
</table>
<br/><button type="button" onclick="location.href='add'">Add New Post</button>
</body>
</html>