package com.sports.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootballApplication {

	public static void main(String[] args) {
		
		//Loading the Spring container using the config file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("detailed-applicationContext.xml");
		
		//Getting the beans from the container.
		FootballCoach theCoach = context.getBean("myFootballCoach", FootballCoach.class);
		
		/*FootballCoach theAlphaCoach = context.getBean("myFootballCoach", FootballCoach.class);
		
		boolean result = (theCoach == theAlphaCoach);
		
		
		System.out.println("Are theCoach and theAlphaCoach pointing to the same object: " + result);
		System.out.println("The memory address to theCoach: " + theCoach);
		System.out.println("The memory address to theAlphaCoach: " + theAlphaCoach);*/
		
		
		//Calling the methods.
		System.out.println(theCoach.getContactNumber());
		
		//Close the context.
		context.close();

	}

}