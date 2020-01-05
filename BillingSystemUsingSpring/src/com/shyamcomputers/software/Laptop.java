package com.shyamcomputers.software;

public class Laptop implements ComputerSoftware{

	@Override
	public String osInstallation() {
		
		return "Raise a request to Format your local drive on your Laptop and install a fresh OS";
	}

	@Override
	public double totalCost() {
		
		return 1200;
	}
	

}
