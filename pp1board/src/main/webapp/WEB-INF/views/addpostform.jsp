<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("id");
	String name = (String)session.getAttribute("name");
%>
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
		<tr><td>RC:</td>
		<td><select name="RC">
			<option value="Kuyper">Kuyper</option>
			<option value="Bethel">손양원</option>
			<option value="Rothem">장기려</option>
			<option value="Torrey">Torrey</option>
			<option value="Carmichael">Carmichael</option>
			<option value="Vision">열송</option>
		</select>
		</td></tr>
		<tr><td>Room Number:</td><td><input type="text" name="roomnum"/></td></tr>
		<tr><td>Temperature:</td><td><input type="text" name="temp" /></td></tr>
		<tr><td>Photo</td><td><input type="file" name="uploadPhoto" /></td></tr>
		<!-- <tr><td>Content:</td><td><textarea cols="50" rows="5" name="content"></textarea></td> -->
		<tr><td><input type="hidden" name="name" value="<%=name%>"/></td></tr>
		<tr><td><input type="hidden" name="userID" value="<%=id%>" /></td></tr>
	</table>
	<button type="button" onclick="location.href='list'">view list</button>
	<button type="submit">upload</button>
</form>
</body>
</html>