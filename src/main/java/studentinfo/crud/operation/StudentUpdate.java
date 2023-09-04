package studentinfo.crud.operation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentinfo.entity.Student;
import studentinfo.service.implemetation.ServiceImplementation;

@WebServlet("/update")
public class StudentUpdate extends HttpServlet {
	ServiceImplementation updatestu= new ServiceImplementation();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServiceImplementation updatestudent = new ServiceImplementation();
		Integer no = Integer.parseInt(req.getParameter("id"));
		req.setAttribute("id", no);
		Student student = updatestudent.getStudent(no);
		req.setAttribute("stu", student);

		req.getRequestDispatcher("student/update.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id= Integer.parseInt(req.getParameter("id"));
		String name= req.getParameter("name");
		String email=req.getParameter("email");
		String address= req.getParameter("address");
		Integer roll= Integer.parseInt(req.getParameter("roll"));
		String dob= req.getParameter("dob");
		Student student= new Student(id,name,email,address,roll,dob);
		String msg=updatestu.updateStudent(student);
		resp.getWriter().write(msg);
	}
}
