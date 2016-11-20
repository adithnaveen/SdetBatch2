package com.fannie.day2;

public class CarImpl {
	public static void main(String[] args) {
		Car cars[] = new Car[5];
		
		cars[0] = new BMW(4);
		cars[1] = new BMW(2);
		cars[2] = new Toyota(4);
		cars[3] = new BMW(2);
		cars[4] = new Toyota();
		


		for(Car temp : cars){
			if(temp instanceof BMW){
			((BMW)temp).musicSystem();
			}
			temp.move();
			System.out.println(temp.getDoors());
		}
		
	}
}
