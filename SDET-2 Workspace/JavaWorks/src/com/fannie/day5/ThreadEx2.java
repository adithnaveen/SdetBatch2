package com.fannie.day5;



class BusinessLogic extends Thread {

	@Override
	public void run() {
		// all business logic is here

		for (int i = 0; i < 450; i++) {
			System.out.println("i value in " + Thread.currentThread().getName() + " is " + i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		System.out.println("Exiting " + Thread.currentThread().getName());

	}

}

public class ThreadEx2 {
	public static void main(String[] args) {

		BusinessLogic bl1 = new BusinessLogic();
		bl1.setName("Marker");
		bl1.setPriority(Thread.NORM_PRIORITY);
		bl1.start();

		BusinessLogic bl2 = new BusinessLogic();
		bl2.setName("FlipChart");
		bl2.setPriority(bl1.getPriority() + 1);
		bl2.start();

		BusinessLogic bl3 = new BusinessLogic();
		bl3.setName("Coffee Cup");
		bl3.setPriority(Thread.MAX_PRIORITY);
		bl3.start();

		try {
			bl1.join();
			bl2.join();
			bl3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Main Exiting.... ");

	}
}
