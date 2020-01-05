package com.jms.coach;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting";
	}
	
	@Override
	public String getDailyFood() {
		return "Get the food according to the dietician of the Baseball";
		
	}
	
	private HappyFortuneService fortuneService;
	
	public BaseballCoach(HappyFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getHappyFortuneService() {
		
		return fortuneService.getFortuneService();
	}
	
}
