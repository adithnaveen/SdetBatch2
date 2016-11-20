package com.fannie.day2;

public class BMW extends Car{
	public BMW(int noOfDoors){
		super(noOfDoors);
	}
	
	public void musicSystem(){
		System.out.println("BMW comes with music system");
	}

	@Override
	public void move() {
		System.out.println("BMW Moves...");
	}
	
	
	
}
