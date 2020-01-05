package com.sports.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrackApplication {

	public static void main(String[] args) {
		
		//Loading the Spring container using the config file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Getting the beans from the container.
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);
		
		Coach theAlphaCoach = context.getBean("myTrackCoach", Coach.class);
		
		boolean result = (theCoach == theAlphaCoach);
		
		
		System.out.println("Are theCoach and theAlphaCoach pointing to the same object: " + result);
		System.out.println("The memory address to theCoach: " + theCoach);
		System.out.println("The memory address to theAlphaCoach: " + theAlphaCoach);
		
		
		//Calling the methods.
		
		
		//Close the context.
		context.close();

	}

}
