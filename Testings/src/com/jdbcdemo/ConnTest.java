package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnTest {
	
	static String name;
	static int age;
	static Connection con=null;
	static Statement stmt=null;
	static String uname;
	static String pass;
	//static ResultSet=null;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		name="jayant";
		age=30;
		String sql = "SELECT uname, pass FROM user";
		ResultSet rs=null;
		String sql1="select count(*) from dual";
		
		
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
	
		
		
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/auth", "jay", "passpass");
		
		
		if(con!=null)
		{
			System.out.println("Connection established successfully");
		}
		
		
			stmt = con.createStatement();
		
			 rs=stmt.executeQuery(sql);
			 //ResultSet rs1=stmt.executeQuery("select count(*) from user");
			 while(rs.next())
			 {
				 uname  = rs.getString("uname");
				 pass = rs.getString("pass");
				 
			 }
			 rs=stmt.executeQuery("select count(*) from user");
			
			 while(rs.next())
			 {
				 int count  = rs.getInt(1);
				 System.out.println("count ="+count);
				 
			 }
			 rs=stmt.executeQuery(sql1);
			 while(rs.next())
			 {
				 int count=rs.getInt(1);
				 System.out.println("count1 ="+count);
			 }
			
	
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(uname);
		}
		
		//System.out.println(rs.getString());
		
		
	}
