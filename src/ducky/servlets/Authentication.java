package ducky.servlets;

import ducky.models.DatabaseManagement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by KV on 16/12/2016.
 */
public class Authentication extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		DatabaseManagement dm = new DatabaseManagement();
		if(dm.checkUser(username,password)){
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("show.jsp");
			requestDispatcher.forward(request,response);
		}else{
			response.sendRedirect("login.jsp");
		}

	}
}
