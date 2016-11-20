package com.fannie.carfactory;
public class CarFactory{

	private CarFactory(){}
	public static Car getCar(int  car){
		if(car ==1){
			return new BMW();
		} else 	if(car ==2){
			return new Volvo();
		} else if(car ==3){
			return new Mercedes();
		}

	
		return null;

	}
}

