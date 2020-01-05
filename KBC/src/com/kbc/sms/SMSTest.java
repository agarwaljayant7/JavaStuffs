package com.kbc.sms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */

@WebServlet("/SMSTest")
public class SMSTest extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	/*	String apikey="apikey="+"reJXa790v00-xBgt1Q5qtTq3WJy5lTDV34MrFxyInR";
		String message="&message="+"This is your message";
		String sender="&sender="+"TXTLCL";
		String numbers="&numbers="+"919632151507";
		try
	    {
	           
	           HttpURLConnection conn=(HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
	           String data=apikey+numbers+message+sender;
	           conn.setDoOutput(true); 
	           conn.setRequestMethod("POST");
	           conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
	           conn.getOutputStream().write(data.getBytes("UTF-8"));
	           final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	           final StringBuffer stringBuffer = new StringBuffer();
	           String line;
	           while ((line = rd.readLine()) != null) 
	           {
				stringBuffer.append(line);
	           }
	           rd.close();
	           
	           //return stringBuffer.toString();
	                    
	           
	    }
	    catch(Exception e)
	    {
	        System.out.println("Error SMS "+e);
	        //return "Error "+e;
	    }*/
			response.sendRedirect("SendRequest.jsp");

}
}

/*



    
*/