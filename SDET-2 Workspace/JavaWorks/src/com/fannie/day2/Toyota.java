package com.fannie.day2;

public class Toyota extends Car {

	public Toyota(){}
	
	public Toyota(int noOfDoors){
		
		super(noOfDoors);
	}

	@Override
	public void move() {
		System.out.println("Toyota is Moving... ");
	}
	
	
	
}
