package com.fannie.day2;

public class ExceptionEx1 {
	public static void main(String[] args) {
		
		try{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		try{
			int vals[] = new int[-4];
		}catch(NegativeArraySizeException nase){
			System.out.println
			("sorry you cannot initalize array with -ve values");
			
		}
		
		
		int res = num1 / num2;

		System.out.println("Result is " + res);
		}catch(ArithmeticException ae){
			System.out.println("in arithmeticexception");
			ae.printStackTrace();
		}catch(NumberFormatException nfe){
			System.out.println(nfe);
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("Sorry please pass all params");
		}catch(Exception e){
			System.out.println("in exception block");
			e.printStackTrace();
		}
		
		
		System.out.println("your Businesslogic continues here");
	}
}
