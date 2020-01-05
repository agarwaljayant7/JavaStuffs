package com.java8;
import java.util.function.Predicate;
public class PredicateDemo {

	public static void main(String[] args) {
		
		//Predicate<Integer> f=i->i*i;
		Predicate<Integer> p= i->i%2==0;
		
		System.out.println(p.test(4));
		System.out.println(p.test(5));
		
		
	}

}
