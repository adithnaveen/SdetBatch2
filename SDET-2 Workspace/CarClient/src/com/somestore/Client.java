package com.somestore;

import com.fannie.carfactory.Car;
import com.fannie.carfactory.CarFactory;

public class Client {
	public static void main(String[] args) {
		Car[] cars = new Car[3];

		
		
		
		cars[0]= CarFactory.getCar(Car.BMW);
		cars[1]= CarFactory.getCar(Car.BMW);
		cars[2]= CarFactory.getCar(Car.VOLVO);
		
		for(Car temp : cars){
			
		}
		
		
	}
}
