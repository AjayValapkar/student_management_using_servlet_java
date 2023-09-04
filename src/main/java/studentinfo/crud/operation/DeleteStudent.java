package studentinfo.crud.operation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentinfo.service.implemetation.ServiceImplementation;

@WebServlet("/delete")
public class DeleteStudent extends HttpServlet {
	ServiceImplementation deletstudent= new ServiceImplementation();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id= Integer.parseInt(req.getParameter("id"));
		String msg= deletstudent.deleteStudent(id);
		resp.getWriter().write(msg);
	}
}
