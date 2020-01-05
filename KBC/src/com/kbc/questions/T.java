package com.kbc.questions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class T
 */
@WebServlet("/T")
public class T extends Thread {

	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("Child thread");
		}
	}
	
}

class T1
{
	public static void main(String[] args)
	{
		T t=new T();
		t.start();
		System.out.println("main thread");
	}
}
