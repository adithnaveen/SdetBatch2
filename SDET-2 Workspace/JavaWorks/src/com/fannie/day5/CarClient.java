package com.fannie.day5;

import com.fannie.day6.Car;
import com.fannie.day6.ICar;

public class CarClient {
	public static void main(String[] args) {
		Car bmw1 = Car.createCar(ICar.BMW);
	}
}


// will write a program which uses the method invocation from 
// ICar not from Car class, also try to make Car class abstract
