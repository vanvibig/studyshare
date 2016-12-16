package ducky.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by KV on 16/12/2016.
 */
//@WebServlet("/ducky")
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
		ServletConfig config = this.getServletConfig();
		String song = config.getInitParameter("song");
		PrintWriter writer = response.getWriter();
		writer.println("Hello World " + method + "\n");
		writer.println("The song is: " + song);

		ServletContext context = this.getServletContext();
		this.getServletConfig().getServletContext();
		String account = context.getInitParameter("account");
		String pass = context.getInitParameter("pass");
		writer.println("Account: " + account);
		writer.println("Pass: " + pass);


	}
}
