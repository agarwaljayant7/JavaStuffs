package com.jms.coach;

public class FootballCoach implements Coach{

	private HappyFortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Do the football practice for 1 hour";
		
	}

	@Override
	public String getDailyFood() {
		return "Get the diet according to the dietician of the football";
		
	}

	@Override
	public String getHappyFortuneService() {
		return fortuneService.getFortuneService();
	}

	public FootballCoach(HappyFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	

}
