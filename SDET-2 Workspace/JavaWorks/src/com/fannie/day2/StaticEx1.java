package com.fannie.day2;


// static variables are available first 
// static methods are loaded first
// static blocks are executed first 
public class StaticEx1 {

	static int s1;
	static int hra;
	
	public static int sum(int num1, int num2){
		s1 = 100;
		return num1 + num2;
	}
	
	public static void method1(){
		System.out.println("Value of s1 is " + s1);
		System.out.println("This is static method 1");
	}
	
	static{
		method1();
		System.out.println("This is first static block");
	}
	
	static {
		hra =  s1 + 100*3/5;
		System.out.println("This is second static block");
	}
	
	public static void main(String[] args) {
		Runtime.getRuntime().gc();

		System.out.println(sum(33,22));
		method1();
	}
	
	static{
		System.out.println("this is third static block");
	}
}
