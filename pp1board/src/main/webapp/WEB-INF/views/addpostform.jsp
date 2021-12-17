<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%
	String id = (String)session.getAttribute("id");
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add post</title>
<link rel="stylesheet" type="text/css" href="liststyle.css">
</head>
<body>
<form action="addok" method="post" enctype="multipart/form-data">
	<table id="edit">
		<tr><td>RC:</td><td><input type="text" name="title"/></td></tr>
		<tr><td>Room Number:</td><td><input type="text" name="category"/></td></tr>
		<tr><td>Name:</td><td><input type="text" name="writer"/></td></tr>
		<tr><td>Photo</td><td><input type="file" name="photo" /></td></tr>
		<tr><td>Content:</td><td><textarea cols="50" rows="5" name="content"></textarea></td>
		<%-- <tr><td><input type="hidden" name="userID" value="<%=id%>" /></td></tr> --%>
	</table>
	<button type="button" onclick="location.href='list'">view list</button>
	<button type="submit">upload</button>
</form>
</body>
</html>