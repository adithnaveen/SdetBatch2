package com.fannie.day2;

public class StaticEx2 {
	
	public static void main(String[] args) {
		hi();
		bye();
		main("hi");
		main(new int[]{44,55,676});
		System.out.println("Do something here - main");
	}

	public static void hi(){}
	public static void bye(){}
	
	
	public static void main(String args){
		System.out.println("stinrg called.. ");
	}
	
	public static void main(int [] val){
		System.out.println("Array of int  called.");
	}
	
}
