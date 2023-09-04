<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<style type="text/css">
.conta {
	width: 50%;
	margin: 5% auto 4% auto;
	box-shadow: 1px 2px 7px rgb(0, 0, 115);
	padding: 3%;
}

.conta h3 {
	font-size: 2rem;
}

.navbar {
	width: 60%;
	margin: 0 auto;
}

.nav-list {
	list-style: none;
	display: inline;
}

.nav-list li {
	margin: 8%;
	padding: 3%;
	background-color: rgb(150, 225, 255);
	display: inline;
	border-radius: 10px;
	box-shadow: 1px 3px 4px black;
	cursor: pointer;
}

.nav-list li a {
	text-decoration: none;
	color: black;
	font-size: 20px;
	font-weight: 500;
}
</style>
</head>
<body>
	<div class="conta">
		<h3>Hii Username</h3>
		<br>
		<div class="navbar">
			<ul class="nav-list">
				<li><a href="addstudent">Add Student </a></li>
				<li><a href="studentinfo">Student Info</a></li>
			</ul>
		</div>
		<br>
	</div>
</body>
</html>