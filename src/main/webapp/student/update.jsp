<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="studentinfo.entity.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.student-form {
	width: 50%;
	margin: 4% auto 5% auto;
	text-align: center;
	box-shadow: 1px 2px 8px rgb(0, 60, 83);
	border-radius: 10px;
	padding: 3%;
}

.student-form h4 {
	color: black;
	font-size: 2rem;
	font-weight: 650;
}

.student-form input[type="text"], input[type="password"], input[type="email"],
	input[type="date"] {
	display: flex;
	justify-content: center;
	align-items: center;
	width: 70%;
	margin: 2% auto 2% auto;
	padding: 2%;
	border-radius: 10px;
	font-size: 16px;
}

.student-form input:focus {
	outline: none;
}

.student-form input::placeholder {
	font-size: 16px;
}

.student-form input[type="submit"] {
	width: 30%;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 2%;
	margin: 2% auto 2% auto;
	border: none;
	box-shadow: 0px 2px 2px black;
	border-radius: 10px;
	background-image: linear-gradient(to right, rgb(181, 209, 255),
		rgb(0, 119, 255));
	font-size: 16px;
	font-weight: 600;
	cursor: pointer;
}

.student-form h3 {
	margin-left: 14%;
	text-align: start;
}
</style>
</head>
<body>

	<div class="containr">
<%Integer ids=(Integer) request.getAttribute("id");
Student studen= (Student)request.getAttribute("stu");
%>
		<div class="student-form">
			<h3 style="font-size: 1.3rem; cursor: pointer;">
				&#x2190; <a hre="student/dashboard.jsp">Back</a>
			</h3>
			<h4>Fill Details</h4>
			
			<form action="update" class="student" method="post">
			<input hidden type="text" name="id" value=${stu.getId()}>
				<input type="text"  name="name" value=${stu.getName()} > 
				<input type="email" name="email" id="" placeholder="Email ID" value=${stu.getEmail()}>
				<input type="text" name="address" placeholder="Address" value=${stu.getAddress()}>
					 <input type="text" name="roll" placeholder="Roll Number" value=${stu.getRollno()}>
				<h3>BirthDate</h3>
				<input type="date" name="dob" id="" placeholder="BirthDate" value=${stu.getDate()}>
				<input type="submit" value="Update">
			</form>
		</div>
	</div>
</body>
</html>