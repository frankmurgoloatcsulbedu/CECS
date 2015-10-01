<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
<br>
<br>
<hr>
<p>${message}</p>
<form action="/login" method="post"  class="well">
USERNAME : <input type="text" name=username>
PASSWORD : <input type="password" name="password"/>
<input type="submit" value="Login"/>
</form>
</body>
</html>