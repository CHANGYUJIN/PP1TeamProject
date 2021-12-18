<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="${pageContext.request.contextPath}/resources/form.css" rel="stylesheet">
<title>login</title>
<style>
</style>
</head>
<body>
<div style="width:100%; text-align:center; padding-top:100px">
<img src="${pageContext.request.contextPath}/resources/img/snowman.jpg" height="250">
<form method="post" action="loginOk">
<div><label>User ID: </label><input type='text' name='userid' /></div>
<div><label>Password: </label>
	<input type='password' name='password' /></div>
<button type="submit">login</button>
</form>
</div>
</body>
</html>