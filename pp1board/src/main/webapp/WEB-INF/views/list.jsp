<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>list</title>
	<link rel="stylesheet" href="form.css">
<script>
	function delete_ok(id){
		var a = confirm("정말로 삭제하겠습니까?");
		if(a) location.href='deleteok/' + id;
	}
</script>
</head>
<body>
<h1>Dorm Roll-call</h1>
<table id="list" width="90%">
<tr>
	<th>PNO.</th>
	<th>RC</th>
	<th>Room #</th>
	<th>User ID</th>
	<th>Name  </th>
	<th>RegDate</th>
</tr>
<c:forEach items="${list}" var="u">
	<tr>
		<td>${u.seq}</td>
		<td>${u.RC}</td>
		<td>${u.roomnum}</td>
		<td>${u.userID}</td>
		<td>${u.name}</td>
		<td>${u.regdate}</td>
		<td><a href="view/${u.seq}">View</a></td>
		<td><a href="javascript:delete_ok('${u.seq}')">Delete</a></td>
	</tr>
</c:forEach>
</table>
<br/><button type="button" onclick="location.href='add'">Add New Post</button>
<button type="button" onclick="location.href='logout'">Logout</button>
</body>
</html>