package com.jagganatha.amountcal;

public class CalculateAmount {
	int parathe;
	double totalAmount;

	public int getParathe() {
		return parathe;
	}

	public void setParathe(int parathe) {
		this.parathe = parathe;
	}
	
	public double calTotal() {
		
		totalAmount = 30 * getParathe();
		return totalAmount;
		
	}
}
