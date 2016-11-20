package com.fannie.day5;

public class Account {
	int amount;

	public Account(int amount) {
		this.amount = amount;
	}

	public static void something(){
		System.out.println("something called... ");
	}
	public synchronized void withdraw(int withDrawAmount) {
		if (withDrawAmount < amount) {
			try {
				Thread.sleep(1000, 4);
				amount = amount - withDrawAmount;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(
					"Amount withdrawn successfully for " + 
			Thread.currentThread().getName() + ", Balance : " + amount);
		} else {

			System.out.println(
					"Sorry No balance, current balance is " + amount + ", for " +
							Thread.currentThread().getName());
		}
	}
}
