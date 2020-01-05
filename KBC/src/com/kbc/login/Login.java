package com.kbc.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */

@WebServlet("/Login")
public class Login extends HttpServlet {
	
/*
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		if(uname.equals("jayant") && pass.equals("123"))			
		{
			HttpSession session=request.getSession();
			session.setAttribute("username",uname);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			response.sendRedirect("Index.jsp");
		
		}
*/
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
		 response.setContentType("text/html;charset=UTF-8");
		 
		 	PrintWriter out = response.getWriter();
			
	        String user = request.getParameter("uname");
	        String pass=request.getParameter("pass");
	        String url="jdbc:mysql://localhost:3306/auth";
	        Connection  con=null;
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
	        	out.println("\n"+"Drived loaded");
	        	
	        	con=DriverManager.getConnection(url,"jay","passpass");
	        	out.println("\n"+"Connection established");
	            
	            Statement stmt = con.createStatement();
	            ResultSet rs= stmt.executeQuery(sql);
	    
	            // Extract data from result set
	            while(rs.next()){
	               //Retrieve by column name
	                 uname  = rs.getString("uname");
	                 passwd = rs.getString("pass");
	            }
	        }
	          catch(Exception se)
	          {
	              //se.printStackTrace();
	              out.println(se);
	          }	
	        finally
	        {
	        	try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        
	        if (user.equals(uname) )
	        {
                out.println("Login Success...!");
                HttpSession session=request.getSession();
    			session.setAttribute("username",uname);
    			response.sendRedirect("Welcome.jsp");
                
	        }
            else
            {
                out.println("Login Failed...!");
                response.sendRedirect("Index.jsp");
            }
        }
		
	}
	


