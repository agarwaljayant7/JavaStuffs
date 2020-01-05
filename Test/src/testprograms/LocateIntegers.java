package testprograms;

import java.util.Scanner;

public class LocateIntegers {
	
	static int[] numbers;
	static Scanner s;
	static int c;
	static String ch;
	public static void main(String[] args)
	{
		numbers=new int[5];
		s=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		s.nextLine();
		
		System.out.println("Do you wish to continue (Y/N)");
		ch=s.nextLine();
		
		if(ch=="Y")
		{
		
			System.out.println("Enter a number: ");
			s.nextLine();
			
			System.out.println("Do you wish to continue (Y/N)");
			
			ch=s.nextLine();
			
			c++;
		
		
		}
		

	}

	
}
