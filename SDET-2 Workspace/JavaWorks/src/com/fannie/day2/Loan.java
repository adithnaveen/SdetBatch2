package com.fannie.day2;

public abstract class Loan {
	// abstract methods 
	public abstract int getRoi();
	public abstract int creditScore();
	
	// concrete method 
	public void maxTenure(){
		System.out.println("Max Tenure is 30 years");
	}
}
