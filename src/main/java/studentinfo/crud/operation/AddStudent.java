package studentinfo.crud.operation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentinfo.entity.Student;
import studentinfo.service.implemetation.ServiceImplementation;

@WebServlet("/addstudent")
public class AddStudent extends HttpServlet {
	ServiceImplementation service= new ServiceImplementation();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("student/addstudent.jsp").forward(req, resp);

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name= req.getParameter("name");
		String email=req.getParameter("email");
		String address= req.getParameter("address");
		Integer roll= Integer.parseInt(req.getParameter("roll"));
		String dob= req.getParameter("dob");
		Student student= new Student(name,email,address,roll,dob);
		service.addStudent(student);
		req.getRequestDispatcher("student/addstudent.jsp").forward(req, resp);
		
		
	}
}
