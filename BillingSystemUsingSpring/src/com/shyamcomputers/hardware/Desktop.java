package com.shyamcomputers.hardware;

public class Desktop implements ComputerHardware{

	@Override
	public String maintenance() {
		
		return "Troubleshooting the SMPS issue";
	}

	@Override
	public int totalCost() {
		
		return 1000;
	}
	

}
