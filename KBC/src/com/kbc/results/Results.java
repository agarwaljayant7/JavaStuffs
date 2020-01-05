package com.kbc.results;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
/**
 * Servlet implementation class Results
 */
@WebServlet("/Results")
public class Results extends HttpServlet {

	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String first=request.getParameter("first");
		String last=request.getParameter("last");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String state=request.getParameter("state");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		HttpSession session=request.getSession();
		session.setAttribute("fname",first);
		session.setAttribute("lname",last);
		session.setAttribute("email",email);
		session.setAttribute("gen",gender);
		session.setAttribute("st",state);
		session.setAttribute("user", uname);
		session.setAttribute("password", pass);
		
		//response.sendRedirect("results.jsp");
	
	}*/
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
		 response.setContentType("text/html;charset=UTF-8");
		 
		 	PrintWriter out = response.getWriter();
			
	        String user = request.getParameter("uname");
	        String pass=request.getParameter("pass");
	        String first=request.getParameter("first");
			String last=request.getParameter("last");
			String email=request.getParameter("email");
			String gender=request.getParameter("gender");
			String state=request.getParameter("state");
			
	        String url="jdbc:mysql://localhost:3306/auth";
	        String sql;
            sql = "SELECT uname, pass FROM user";
            String uname=null, passwd=null;
            
            /*String uname="";
            String passwd="";
            */
	        //out.println("Hello");
	        try{
	        	//loading drivers for mysql
	        
	        	Class.forName("com.mysql.jdbc.Driver");
	        	//out.println("\n"+"Drived loaded");
	        	
	        	Connection  con=DriverManager.getConnection(url,"jay","passpass");
	        	//out.println("\n"+"Connection established");
	            PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
	           
	            ps.setString(1, user);
	            ps.setString(2, pass);
	            ps.setString(3, first);
	            ps.setString(4, last);
	            ps.setString(5, email);
	            ps.setString(6, gender);
	            ps.setString(7,	state);
	            
	            int i=ps.executeUpdate();
	            
	            if(i>0)
	            {
	              out.println("\n"+"You are sucessfully registered");
	              HttpSession session=request.getSession();
	    			session.setAttribute("username",user);
	    			session.setAttribute("pass",pass);
	    			session.setAttribute("first",first);
	    			session.setAttribute("last",last);
	    			session.setAttribute("email",email);
	    			session.setAttribute("gender",gender);
	    			session.setAttribute("state",state);
	    			
	    			response.sendRedirect("Welcome.jsp");
	            }
	        }
	          catch(Exception se)
	          {
	              //se.printStackTrace();
	              out.println(se);
	          }	
	        
	        //out.println("Bye");
		
	}
	}


