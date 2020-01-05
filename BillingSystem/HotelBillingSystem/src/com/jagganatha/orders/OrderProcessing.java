package com.jagganatha.orders;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jagganatha.amountcal.CalculateAmount;


//@WebServlet("/OrderProcessing")
public class OrderProcessing extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out;
	String parathe;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		out = response.getWriter();
		
		parathe = request.getParameter("parathe");
		
		out.println("Parathe ordered...");
		out.println();
		CalculateAmount calculateAmount = new CalculateAmount();
		calculateAmount.setParathe(4);
		
		out.println("\n"+"\n"+"Total amount = " + calculateAmount.calTotal());
		
		//out.println("Processing order...");
		out.close();
	}

}
