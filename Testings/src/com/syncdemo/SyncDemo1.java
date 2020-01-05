package com.syncdemo;



class Disp
{
	int count;
	synchronized int m1() throws InterruptedException
	{
		for(int i=0;i<3;i++)
		{
			Thread.sleep(1000);
			{
				count++;
			}
			
		}
		return count;
	}
	
	synchronized int m2() throws InterruptedException
	{
		for(int i=0;i<3;i++)
		{
			Thread.sleep(1000);
			count++;
		}
		return count;
	}
	
}

class Th1 extends Thread
{
	Disp d;
	Th1(Disp d)
	{
		this.d=d;
	}
	public void run()
	{
		try {
			d.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("From Th1: "+d.m1());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

class Th2 implements Runnable
{
	Disp d;
	Th2(Disp d)
	{
		this.d=d;
	}

	@Override
	public void run() 
	{
			try {
				System.out.println("From Th2: "+d.m2());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
public class SyncDemo1 {
	
	public static void main(String[] args)
	{
		Disp d=new Disp();
		Th1 t1=new Th1(d);
		Th2 t2=new Th2(d);
		t1.start();
		Thread t=new Thread(t2);
		t.start();
	}
}
