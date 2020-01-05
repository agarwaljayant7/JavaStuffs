package com.java8;

import java.util.function.Function;

public class FunctionalProgramming {

	public static void main(String[] args) {
		Function<String,String>f=s->s+s;
		
		System.out.println("String concatation "+f.apply("jayant"));
		System.out.println("String concatation "+f.apply("agarwal"));
		

	}

}
