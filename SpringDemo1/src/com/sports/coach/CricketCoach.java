package com.sports.coach;

public class CricketCoach implements Coach {
	
	private FortuneService dailyFortune;
	private String emailAddress;
	private String teamName;
	
	@Override
	public String getDailyWorkOuts() {

		return "Do the bowling for 30 minutes";
	}

	public CricketCoach() {
		System.out.println("Inside the CricketCoach Constructor");
		//this.dailyFortune = dailyFortune;
	}
	
	@Override
	public String getDailyFortune() {
		return dailyFortune.getDailyFortune();
	}
	
	
	public void setDailyFortune(FortuneService dailyFortune) {
		//System.out.println("Inside the setter method");
		this.dailyFortune = dailyFortune;
	}

	public String getAdditionalFortune() {
		return dailyFortune.getAdditionalFortune();
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}