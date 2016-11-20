package com.fannie.day3;

import java.util.ArrayList;

public class WildCharEx {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		
		
		ArrayList<Double> listd = new ArrayList<Double>();
		listd.add(2000d);
		listd.add(new Double(3000));
		
	//ArrayList<? super Integer> gen = list;
		ArrayList<? extends Number> genric = list;

		for(Number temp : genric){
			System.out.println(temp);
		}

		genric = listd;
		

		for(Number temp : genric){
			System.out.println(temp);
		}
	}
}
