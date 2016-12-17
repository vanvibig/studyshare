package ducky.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.ObjectInput;

/**
 * Created by KV on 16/12/2016.
 */
@WebServlet("/imageshow")
public class ImageShow extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCheck(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCheck(request, response);
	}

	private void doCheck(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		session.invalidate();
		if (username == null){
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request,response);
		}else {
			for (Cookie e: request.getCookies()){
				System.out.println(e.getName());
				System.out.println(e.getValue());
			}

			this.getServletContext().setAttribute("otherScope", "Application Scope");

//			session.setAttribute("otherScope", "Request Scope");
			request.setAttribute("otherScope", "Session Scope");

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("crocodile.jsp");
			requestDispatcher.forward(request,response);
		}
	}
}
