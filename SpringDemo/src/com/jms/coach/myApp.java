package com.jms.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class myApp {

	public static void main(String[] args) {
		
		//Creating the Spring Container.
				ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//Getting the bean from the Container.
		Coach coach = appContext.getBean("myCoach", Coach.class);
				
				
		//calling the methods.
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFood());
		System.out.println(coach.getHappyFortuneService());
				
				
		//closing the resource.
		appContext.close();
				
	}

}
