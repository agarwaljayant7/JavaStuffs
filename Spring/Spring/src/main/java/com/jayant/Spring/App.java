package com.jayant.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args)
	{
		/*Car car=new Car();
		car.drive();
		
		Bike bike =new Bike();
		bike.drive();*/
		
		/*Vehicle obj=new Bike();
		obj.drive();
		
		obj=new Car();
		obj.drive();*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj=(Vehicle) context.getBean("bike");
		obj.drive();
		
		
	}
}
