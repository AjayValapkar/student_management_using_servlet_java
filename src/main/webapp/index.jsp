<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/> 
</head>
<body>
	<div class="container">
		<div class="login-form">
			<h3>Admin Login</h3>
			<form action="login" class="form-login" method="post">
				<input type="text" name="username" placeholder="UserName "><br>
				<input type="password" name="password" placeholder="PassWord"><br>
				<input type="submit" value="Login"><br>
				<a href="student/dashboard.jsp">go to</a>
			</form>
		</div>
	</div>
</body>
</html>