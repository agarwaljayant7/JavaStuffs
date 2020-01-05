package com.sports.coach;

public class FootballCoach implements Coach {
	private FortuneService dailyFortune;
	private String contactNumber;
	
	
	
	public FootballCoach(FortuneService dailyFortune) {
		System.out.println("Inside the constructor: Football Coach");
		this.dailyFortune = dailyFortune;
	}

	@Override
	public String getDailyWorkOuts() {
		return "Wake up and do the practice for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return dailyFortune.getDailyFortune();
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public void doMyStartupStuff() {
		System.out.println("Inside the method doMyStartupStuff() method as an init method");
	}
	
	public void doMyCleanUpStuffYoYo() {
		
		System.out.println("Inside the method doMyCleanUpStuffYoYo() method as destroy method");
	}

}