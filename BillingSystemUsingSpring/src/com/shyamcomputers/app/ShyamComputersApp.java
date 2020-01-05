package com.shyamcomputers.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shyamcomputers.hardware.ComputerHardware;
import com.shyamcomputers.software.ComputerSoftware;

public class ShyamComputersApp {

	public static void main(String[] args) {
		
		//Creating the Spring Container.
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("ShyamComputersContext.xml");
		
		//Getting the bean from the Container.
		ComputerHardware compHardware = appContext.getBean("hardwareBean", ComputerHardware.class);
		ComputerSoftware compSoftware = appContext.getBean("softwareBean",ComputerSoftware.class);
		
		//calling the methods.
		System.out.println(compHardware.maintenance());
		System.out.println("Total Cost of the hardware maintenance is: " + compHardware.totalCost());
		
		System.out.println(compSoftware.osInstallation());
		System.out.println("Total Cost of the software work is: " + compSoftware.totalCost());
		//closing the resource.
		appContext.close();
		
		
	}
}
