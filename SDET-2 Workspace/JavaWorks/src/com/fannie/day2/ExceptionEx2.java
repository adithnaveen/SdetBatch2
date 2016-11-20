package com.fannie.day2;

public class ExceptionEx2 {
	public static void main(String[] args) {
		try{
			int x = 33/0;
			System.out.println("X value is " + x);
			return;
		}finally{
			System.out.println("hi i'm there always... ");
		}
	}
}
