package ducky.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
		String username = (String) request.getAttribute("username");
		if (username == null){
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request,response);
		}else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("crocodile.jsp");
			requestDispatcher.forward(request,response);
		}
	}
}
