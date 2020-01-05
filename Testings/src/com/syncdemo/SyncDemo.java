package com.syncdemo;

class Display
{
	String name;
	public synchronized void wish(String name) throws InterruptedException
	{
		this.name=name;
		for(int i=0;i<3;i++)
		{                                                                                
			Thread.sleep(1000);
			System.out.println("Good Morning"+name);
		}
	}
	public synchronized void wish1(String name) throws InterruptedException
	{
		this.name=name;
		for(int i=0;i<3;i++)
		{                                                                                
			Thread.sleep(1000);
			System.out.println("Good Morning"+name);
		}
	}
}
class T1 extends Thread
{
	Display d;
	String name;
	
	T1(Display d)
	{
		this.d=d;
	}
	public void run()
	{
		try {
			d.wish("Sachin");
			d.wish1("Sourav");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class T2 extends Thread 
{
	Display d;
	String name;
	
	T2(Display d)
	{
		this.d=d;
	}
	public void run()
	{
		try {
			d.wish("Dhoni");
			d.wish1("Sehwag");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class SyncDemo {
public static void main(String[] args)
{	
	Display d=new Display();
	
	T1 t1=new T1(d);
	T2 t2=new T2(d);
	//t2.setPriority(10);
	
	t1.start();
	t2.start();
	
}
}
