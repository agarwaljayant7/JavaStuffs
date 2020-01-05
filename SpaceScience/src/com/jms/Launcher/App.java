package com.jms.Launcher;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		/*Rocket rocket = new Rocket();
		System.out.println("Hello");
		System.out.println(rocket.launch());
		
		Force force = new Force();
		System.out.println(force.getEnergy());*/
		
		//Creating the Spring Container.
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//Getting the bean from the Container.
		SpaceVehicles vehicle = appContext.getBean("rocket", SpaceVehicles.class);
		
		//calling the methods.
		
		System.out.println(vehicle.launch());
		
		System.out.println(vehicle.getForce());
		
		//Closing the resources.
		appContext.close();

	}

}