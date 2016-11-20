package com.fannie.day2;

public class Car extends Vehicle {
	private int noOfDoors;
	public boolean hasDoors(){
		return true;
	}
	public Car(){
		this.noOfDoors = 4;
	}

	// this makes the class as immutable 
	public Car(int noOfDoors){
		this.noOfDoors = noOfDoors;
	}

	public int getDoors(){
		return noOfDoors;
	}
}
