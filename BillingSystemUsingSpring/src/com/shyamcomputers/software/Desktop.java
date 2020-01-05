package com.shyamcomputers.software;

public class Desktop implements ComputerSoftware{

	@Override
	public String osInstallation() {
		
		return "Raise a request to Format your local drive on your Desktop and install a fresh OS";
	}

	@Override
	public double totalCost() {
		
		return 1100;
	}
	
	

}
