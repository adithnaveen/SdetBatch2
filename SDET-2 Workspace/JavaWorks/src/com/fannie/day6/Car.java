package com.fannie.day6;


// find the client in day5 package 
public  class Car {//implements ICar {
	
	/*public static Car createCar(int val){
		
	}
	*/
	
	public static Car createCar (final int val){
		
		if(val ==1){
			return new Volvo();
		}else if(val==2){
			return new BMW();
		}
		return null;
	}
	
}


class BMW extends Car{
	BMW(){
		System.out.println("BMW Constructed... ");
	}
}

class Volvo extends Car{
	Volvo(){
		System.out.println("Volvo Constructed... ");
	}
}