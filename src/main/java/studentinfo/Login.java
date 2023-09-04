package studentinfo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentinfo.service.implemetation.ServiceImplementation;

@WebServlet("/login")
public class Login extends HttpServlet {
	ServiceImplementation checkLogin = new ServiceImplementation();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if (checkLogin.checkLogin(username, password))
			req.getRequestDispatcher("student/dashboard.jsp").forward(req, resp);
		else
			resp.getWriter().write("Unsuccessfull Login ");
	}
}
