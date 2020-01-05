package com.shyamcomputers.hardware;

public class Laptop implements ComputerHardware{

	@Override
	public String maintenance() {
		
		return "Troubleshooting the battery issue";
	}

	@Override
	public int totalCost() {
		
		return 1200;
	}
	

}
