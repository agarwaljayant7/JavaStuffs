package testprograms;


class Main
{
	public void fun1()
	{
		System.out.println("From main ");
	}
}

class Slave extends Main
{
	public void fun1()
	{
		System.out.println("From slave ");
	}
	
}

public class RuntimePolymorphism {

	public static void main(String[] args)
	{
		Main main = new Slave();
		Slave slave = new Slave();
		main.fun1();
		slave.fun1();
		
	}
}
