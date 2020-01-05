package com.syncdemo;

class Read
{
	int count;
	synchronized void m1()
	{
		System.out.println("Inside m1");
		count=count+1;
		System.out.println("Count= "+count);
	}
}
class CreateObj
{
	CreateObj(){
		
		Read o=new Read();
		Thread2.m2(o);
		o.m1();
	}
}
class Thread1 extends Thread
{
	public void run()
	{
		new CreateObj();
	}
}
class Thread2 extends Thread
{
	public static void m2(Read r)
	{
		Read r1;
		r1=r;
	}
	public void run()
	{
		
	}
}

public class SynchronizedDemo {

	public static void main(String[] args)
	{
		Thread1 t1=new Thread1();
		t1.start();
	}
}
