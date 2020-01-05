package com.kbc.questions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Q1
 */
@WebServlet("/Q1")
public class Q1 extends HttpServlet {
	//private int counter = 0;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String url="jdbc:mysql://localhost:3306/questions";
		String sql;
		sql = "SELECT QNo,QName,Answer,Opt FROM GS where QNo=\"1\"";
		int QNo=0;
		String Qname="null", Answer="null",Opt=null;
		
		Connection  con=null;
		Statement stmt;
		ResultSet rs;
		
		String A = request.getParameter("A");
		String B = request.getParameter("B");
		String C = request.getParameter("C");
		String D = request.getParameter("D");
		String A1=A.substring(0,1);
		
		out.println("A1: "+A1);
		out.println("B: "+B);
		//String B1=B.substring(0,1);
		
		/*String C1=C.substring(0,1);
		String D1=D.substring(0,1);
		out.println("A1: "+A1);
		out.println("B1: "+B1);
		out.println("C1: "+C1);
		out.println("D1: "+D1);
		*/
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			out.println("\n"+"Drived loaded");
			con=DriverManager.getConnection(url,"jay","passpass");
			out.println("\n"+"Connection established");
			stmt = con.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				QNo=rs.getInt("QNo");
				Qname=rs.getString("QName");
				Answer=rs.getString("Answer");
				Opt=rs.getString("Opt");
			}
			out.println("QNo= "+QNo);
			out.println("Qname= "+Qname);
			out.println("Answer= "+Answer);
			out.println("Opt= "+Opt);
			
			
			/*
			String A1=A.substring(0,1);
			String B1=B.substring(0,1);
			String C1=C.substring(0,1);
			String D1=D.substring(0,1);
			
			out.println("A1: "+A);
			out.println("B1: "+B1);
			out.println("C1: "+C1);
			out.println("D1: "+D1);
			out.println("A1: "+A1);
			
			if (A1 == Opt) 
			{
				out.println("Bingo!! Option " + "'" + A + "'" + " is the Right Answer ");
			}
			else if(B1==Opt)
			{
				out.println("Bingo!! Option " + "'" + B + "'" + " is the Right Answer ");
			} 
			else if (C1 == Opt) 
			{
				out.println("Bingo!! Option " + "'" + C + "'" + " is the Right Answer ");
			}
			else if (D1 == Opt) 
			{
				out.println("Bingo!! Option " + "'" + D + "'" + " is the Right Answer ");
			}
			else {
				out.println("Sorry! Wrong answer ");
			}
			
			*/
			
		}
		 catch (SQLException se) 
		{
			 out.println(se);
		} 
		catch (ClassNotFoundException cnfe)
		{
			out.println(cnfe);
		}
		
		finally
		{
			try {
				con.close();
				out.println("Connection Closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
/*
		String A = request.getParameter("A");
		String B = request.getParameter("B");
		String C = request.getParameter("C");
		String D = request.getParameter("D");
		// out.println("You entered ");

		if (request.getParameter("A") != null) {
			out.println("Sorry, Option " + "'" + A + "'" + " is the Wrong Answer ");
		} else if (request.getParameter("B") != null) {
			out.println("Sorry, Option " + "'" + B + "'" + " is the Wrong Answer ");
		} else if (request.getParameter("C") != null) {
			out.println("Sorry, Option " + "'" + C + "'" + " is the Wrong Answer ");
		} else if (request.getParameter("D") != null) {

			out.println("Bingo! ");
			out.println("Option " + "'" + D + "'" + " is the right Answer ");

		} else {
			out.println("Please choose any option from A to D");
		}

        out.println("<html>");
        out.println("<body bgcolor=\"white\">");
        out.println("<head>");

        out.println("<title> An ice cream shop </title>");
       // out.println("<form>");
        out.println("</head>");
        out.println("<form name=\"Q1\" action=\"ShowTheQuestions.jsp\" method=\"post\"");
        
        out.println("<body>");
       
        out.println("<input type=submit value=\"Next question\" action=\"ShowTheQuestions.jsp\"");
        out.println("</body>");
        out.println("</form>");
        out.println("</html>");	*/
}	
}

