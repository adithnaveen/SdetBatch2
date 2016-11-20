package com.fannie.day4;

import java.util.Arrays;

public class Sorter {
	public static void main(String[] args) {
		String [] arr = new String[]{"Lavanya", "Gopinath", "Tosha", "Sasi", "Daniel"};
	
		for(String temp : arr)
			System.out.println(temp);
		
		System.out.println("--------------------------");
		
		Arrays.sort(arr);

		for(String temp : arr)
			System.out.println(temp);

	
	}
}
