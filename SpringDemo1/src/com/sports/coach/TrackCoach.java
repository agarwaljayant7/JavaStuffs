package com.sports.coach;

public class TrackCoach implements Coach {

	private FortuneService dailyFortune;
	
	
	public TrackCoach(FortuneService dailyFortune) {
		System.out.println("Inside the constructor of: Track Coach");
		this.dailyFortune = dailyFortune;
	}
	@Override
	public String getDailyWorkOuts() {
		
		return "Go out and run for 5k";
	}

	@Override
	public String getDailyFortune() {
		return dailyFortune.getDailyFortune();
	}

	/*public void setDailyFortune(FortuneService dailyFortune) {
		this.dailyFortune = dailyFortune;
	}*/
	
	public void doMyStartupStuff() {
		System.out.println("Inside the method doMyStartupStuff() method as an init method");
	}
	
	public void doMyCleanUpStuffYoYo() {
		
		System.out.println("Inside the method doMyCleanUpStuffYoYo() method as destroy method");
	}

}