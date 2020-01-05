package com.jms.Launcher;

public class Rocket implements SpaceVehicles {

	private Force force;
	@Override
	public String launch() {
		
		return "Launching Rocket";
	}
	
	public Rocket(Force force) {
		
		this.force = force;
	}
	
	public String getForce() {
		return force.getEnergy();
	}
	
}
