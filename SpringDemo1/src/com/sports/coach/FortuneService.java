package com.sports.coach;

import java.util.Random;

public class FortuneService implements Fortune {

	@Override
	public String getDailyFortune() {
		
		String[] fortunes = {"Today is your lucky day", "Wish you a good luck", "Wish you make the win"};
		
		new Random().nextInt(fortunes.length);
		
		
		/*
		for(int i = 0; i < 3; i++) {
			fortunes[i];
		}*/
		return fortunes[new Random().nextInt(fortunes.length)];
		//return "You've a lucky day";
	}
	
	public String getAdditionalFortune() {
		return "Wish you Win the match";
	}
	
	

}