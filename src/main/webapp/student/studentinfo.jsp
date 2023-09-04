<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="studentinfo.entity.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Information</title>
<style type="text/css">
.student-table {
	width: 80%;
	margin: 3% auto 2% auto;
	padding: 2%;
	box-shadow: 1px 2px 7px skyblue;
}

.student-table h3 {
	text-align: center;
	font-size: 2rem;
}

.student-table table {
	width: 100%;
}

.student-table table th {
	background-color: rgb(39, 39, 39);
	color: white;
	padding: 1%;
	font-size: 20px;
}

.student-table table td {
	font-size: 18px;
	margin: 0;
	padding: 0.5%;
	background-color: rgb(244, 223, 196);
}

table.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>
	<div class="student">
		<div class="student-table">
			<h3>Student Information</h3>
			<table>
				<tbody>
				<thead>
					<tr>
						<th>Name</th>
						<th>Email</th>
						<th>Address</th>
						<th>Roll No</th>
						<th>BirthDate</th>
						<th>Delete</th>
						<th>Update</th>
					</tr>
					
						<%
						List<Student> students = (List<Student>) request.getAttribute("studentlist");
						for (Student student : students) {
							out.write("<tr>");
							out.write("<td>" + student.getName() + "</td>");
							out.write("<td>" + student.getEmail() + "</td>");
							out.write("<td>" + student.getAddress() + "</td>");
							out.write("<td>" + student.getRollno() + "</td>");
							out.write("<td>" + student.getDate() + "</td>");
							out.write("<td><a href=update?id="+student.getId()+"> Update</td>");
							out.write("<td><a href=delete?id="+student.getId()+"> Delete</td>");
							out.write("</tr>");
						}
						%>
				</thead>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>