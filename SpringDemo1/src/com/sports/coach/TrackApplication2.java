package com.sports.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrackApplication2 {

	public static void main(String[] args) {
		
		//Loading the Spring container using the config file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//Getting the beans from the container.
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);
	
		//Calling the methods.
		System.out.println(theCoach.getDailyWorkOuts());
		
		//Close the context.
		context.close();

	}

}
