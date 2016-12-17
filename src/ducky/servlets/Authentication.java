package ducky.servlets;

import ducky.models.DatabaseManagement;
import ducky.models.Image;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * Created by KV on 16/12/2016.
 */
public class Authentication extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		DatabaseManagement dm = new DatabaseManagement();
		if(dm.checkUser(username,password)){
			Cookie cookie = new Cookie("location","Vietnam");
			response.addCookie(cookie);
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(900);
			session.setAttribute("username", username);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/imageshow");
			Image image = new Image("Baby",200,300);
			request.setAttribute("imageName", image);

			session.setAttribute("test", new Image("Testing image",200,300));
			session.removeAttribute("test");

			requestDispatcher.forward(request,response);
		}else{
			response.sendRedirect("login.jsp");
		}

	}
}
