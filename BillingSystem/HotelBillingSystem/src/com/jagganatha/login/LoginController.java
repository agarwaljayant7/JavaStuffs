package com.jagganatha.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jagganatha.menu.Breakfast;


//@WebServlet(description = "Authenticates", urlPatterns = { "/LoginController" })
//@WebServlet("/LoginController")

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String uname, upass;
	PrintWriter out; 
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String username = request.getParameter(username);
		String password = request.getParameter(password);*/
		
		 response.setContentType("text/html");  
		 out = response.getWriter();
		 //out.println("Choose your options: ");
		 
		 //request.setAttribute("username", request.getParameter("username"));
		 	
		 uname = (String)request.getParameter("username");
		 upass = (String) request.getParameter("userpass");
		 
		 out.println("Username = " + uname);
		 out.println("Userpass = " + upass);
		 
		/* if ((!uname.equals("admin")) && (!upass.equals("admin@123"))){
			 out.println("<br>Wrong credentials");
		 }
		 else {
			 RequestDispatcher dispatcher = request.getRequestDispatcher("Menu.jsp");
			 dispatcher.forward(request, response);
		 }*/
		 
		 if((uname.equals("admin") && upass.equals("admin@123"))) {
			 RequestDispatcher dispatcher = request.getRequestDispatcher("Menu.html");
			 dispatcher.forward(request, response);
		 }
		 else {
			 out.println("Sorry! Invalid login");
			 //response.sendRedirect("index.jsp");
		 }
		 /**/
		 
		 //out.println("<Form action ");
		 /*out.println("<br><center><input type = button value = Breakfast> onclick=alert('You pressed the button!') </center><br>");
		 out.println("<br><center><input type = button value = Lunch></center><br>");
		 out.println("<br><center><input type = button value = Snacks></center><br>");*/
		 
		out.close();
		 
		 
	}

}