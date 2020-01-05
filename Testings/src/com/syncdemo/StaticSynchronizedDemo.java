package com.syncdemo;


class Car
{
	static synchronized void m1()
	{
		for (int i=0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Inside m1()");
			System.out.println(Thread.currentThread().getName());
		}
	}
	static synchronized void m2()
	{
		 for (int i=0;i<3;i++)
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Inside m2()");
				System.out.println(Thread.currentThread().getName());
			}
	}
	static void m3()
	{
		System.out.println("Inside m3");
	}
	synchronized void m4()
	{
		System.out.println("Inside m4");
	}
	void m5()
	{
		System.out.println("Inside m5");
	}
}

class MyThread1 extends Thread
{
	public void run()
	{
		/*for (int i=0;i<3;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}*/
		Car.m1();
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		/*for (int i=0;i<3;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}*/	
		Car.m1();
	}
}
public class StaticSynchronizedDemo {

	public static void main(String[] args)
	{
		MyThread1 m1=new MyThread1();
		MyThread2 m2=new MyThread2();
		m1.start();
		m2.start();
	}
}
