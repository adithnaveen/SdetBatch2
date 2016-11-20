package com.fannie.day5;

// program to show working of threads with interface  Runnable 

class YourBusiness{}
class MyBusiness1 extends YourBusiness implements  Runnable {
	
	Thread t;
	
	MyBusiness1(int priority, String name){
		t = new Thread(this);
		t.setPriority(priority);
		t.setName(name);
		t.start(); // the OS level thread is created and run() is called 
	}
	
	public void run() {
		for(int i=0; i<500; i++){
			System.out.println("i : " + i +" in " + 
					Thread.currentThread().getName() +", Priority " + 
					Thread.currentThread().getPriority());
		}
		System.out.println("Exiting " + Thread.currentThread().getName());
	}
}


public class ThreadEx3 {
	public static void main(String[] args) {
		MyBusiness1 mb1 = new MyBusiness1(4, "Mobile");
		MyBusiness1 mb2 = new MyBusiness1(5, "Presenter");
		MyBusiness1 mb3 = new MyBusiness1(2, "Projector");
	}
}
