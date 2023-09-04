package studentinfo.crud.operation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentinfo.entity.Student;
import studentinfo.service.implemetation.ServiceImplementation;

@WebServlet("/studentinfo")
public class StudentInformation extends HttpServlet {
	ServiceImplementation studentrecord = new ServiceImplementation();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Student> student = null;
		student = studentrecord.getAllStudent();
		req.setAttribute("studentlist", student);
		req.getRequestDispatcher("student/studentinfo.jsp").forward(req, resp);

	}
}
