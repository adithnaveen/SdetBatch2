package com.fannie.day3;

import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(5, 3);
		
		// will give you the number of elements which are there in the list 
		System.out.println("Size is " + vec.size());
		System.out.println("Capacity is " + vec.capacity());


		vec.add("One");
		vec.add("Two");
		vec.add("Three");
		vec.add("Four");
		vec.add("Five");
		vec.add("Six");
		vec.add("Seven");
		vec.add("Eight");
		vec.add("Nine");
		vec.add("Ten");

		vec.add("Eleven");
		vec.add("Twelve");
		
		
		
		System.out.println("Size is " + vec.size());
		System.out.println("Capacity is " + vec.capacity());

	}
}
