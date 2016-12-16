package ducky.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by KV on 16/12/2016.
 */
public class Authentication extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter writer = response.getWriter();

		if(username.equals("Ducky") && password.equals("FunnyGuy")){
			writer.println("Wellcome " + username + " to website!!!");
		}else{
			writer.print("Username of Password is incorrect!");
		}

	}
}
