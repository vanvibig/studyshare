package ducky.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by KV on 16/12/2016.
 */
@WebServlet("/ducky")
public class HelloWorld extends HttpServlet {

	public HelloWorld(){
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
		loadParameter(request,response,"by Get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
		loadParameter(request,response,"by Post");
	}

	protected void loadParameter(HttpServletRequest request, HttpServletResponse response, String method) throws ServletException, java.io.IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter writer = response.getWriter();
		writer.println("Hello World" + method + "<br>");
		writer.print("Username " + username + " has " + password);
	}
}
