package com.syncdemo;

class Study 
{
	String subject;
	public synchronized void study(String subject)
	{
		this.subject=subject;
		for(int i=0;i<2;i++)
		{
			System.out.println("Studying..."+subject);
		}
	}
}

class Math extends Thread
{
	Study s;
	public Math(Study s2) {
		s=s2;
	}
	public void run()
	{
		s.study("Math");
	}
}
class English extends Thread
{
	Study s;
	public English(Study s2)
	{
		this.s=s2;
	}
	public void run()
	{
		s.study("English");
	}
}

public class StudyDemo
{
	public static void main(String[] args)
	{
		

	Study s=new Study();
	Math m=new Math(s);
	English e=new English(s);
	m.start();
	e.start();

	}
	
}