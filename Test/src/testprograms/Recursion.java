package testprograms;

public class Recursion {
	
	public static int foo(int a)
	{
		if(a == 0)
		{
			return 1;
		}
		else
		{
			return (a*foo(a-1));
			
		}
		
	}
	
	public static void main(String[] args)
	{
		//foo(5);
		System.out.println("factorial = "+ foo(5));
		
	}
	
	/*public static void main(String[] args)
	{
		bar();
		System.out.println("I'm in main method");
	}
	
	public static void bar()
	{
		DoWork();
		System.out.println("I'm in bar method");
	}
	
	public static void DoWork()
	{
		DoMore();
		System.out.println("I'm in DoWork method");
	}

	public static void DoMore()
	{
		System.out.println("I'm in DoMore method");
	}*/
}

