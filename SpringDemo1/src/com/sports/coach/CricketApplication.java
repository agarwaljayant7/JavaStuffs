package com.sports.coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketApplication {

	public static void main(String[] args) {
		
		//Loading the Spring Container through the context file.
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Getting the beans from the container
		
		CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
		
		//Calling the methods
		System.out.println(coach.getDailyWorkOuts());
		System.out.println(coach.getDailyFortune());
		//System.out.println(coach.getAdditionalFortune());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeamName());
		
		
		//closing the resources
		
		context.close();
	}

}
