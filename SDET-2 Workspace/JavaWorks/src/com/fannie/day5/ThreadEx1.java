package com.fannie.day5;

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("Thread Name is " + Thread.currentThread().getName());
		// MIN_PRIORITY  = 1 
		// MAX_PRIORITY = 10
		// NORM_PRIORITY = 5 // default priority 
		System.out.println("Priority is " + Thread.currentThread().getPriority());
	}
}
