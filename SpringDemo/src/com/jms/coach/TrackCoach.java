package com.jms.coach;

public class TrackCoach implements Coach {
	
	private HappyFortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run hard for 5k";
	}

	@Override
	public String getDailyFood() {
		return "Get the food according to the dietician of the TrackPractice";
	}
	
	

	public TrackCoach(HappyFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getHappyFortuneService() {
		return fortuneService.getFortuneService();
	}
}
