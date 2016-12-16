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
@WebServlet(description = "This is a demo", urlPatterns = {"/hello"})
public class HelloWorld extends HttpServlet {

	public HelloWorld(){
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
		PrintWriter writer = response.getWriter();
		writer.println("Hello World");
		writer.println("a   KVvvvv");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {

	}
}
