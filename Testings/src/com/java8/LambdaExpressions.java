package com.java8;

public class LambdaExpressions {

	/*public static void m1(int m)
	{
		System.out.println("Hello "+ m);
	}*/
	
	
/*
	(int m)
	{
		System.out.println("Hello "+m);
	}*/
	
	//(m) -> System.out.println(m);
	//(a,b)-> System.out.println(a+b);
	
	//() -> System.out.println("Hello");
	/*public int squareIt(int m)
	{
		return m*m;
	}*/
	/*(int m)
	{
		return m*m;
	}*/
	//(int n) -> n*n;
	// n -> n*n;
	/*public int m1(String s)
	{
		return s.length();
	}
	*/
	
	//(String s) { return s.length(); }
	//(String s) ->  s.length();
	//(s) -> s.length();
	s -> s.length();
	
	public static void main(String[] args) {
		
		
	}

}
