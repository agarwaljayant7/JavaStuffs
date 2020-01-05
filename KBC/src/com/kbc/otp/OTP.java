package com.kbc.otp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OTP
 */
@WebServlet("/OTP")
public class OTP extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
				//response.sendRedirect("OTPPage.jsp");
		 	PrintWriter pr=response.getWriter();
		 	
			int len=4;
	        pr.println("Generating OTP .... ");
	        
	        // Using numeric values
	        String numbers = "0123456789";

	        // Using random method
	        Random rndm_method = new Random();

	        char[] otp = new char[len];

	        for (int i = 0; i < len; i++)  
	        {
	            // Use of charAt() method : to get character value
	            // Use of nextInt() as it is scanning the value as int
	            otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));  

	        } 
	       pr.print("Your OTP is: ");
	       pr.println(otp);
	    }
	   
	       


	}
