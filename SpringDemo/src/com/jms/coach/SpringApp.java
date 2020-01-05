package com.jms.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		//load the Spring Container.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from Spring Container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		//call the methods on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFood());
		
		//close the resource.
		context.close();
		
	}
	
	
}
