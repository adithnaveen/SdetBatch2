package com.fannie.day5;

public class SyncTest implements Runnable{
	Account a; 
	int amount;
	
	public static void main(String[] args) {
		Account account = new Account(1000);
		new SyncTest(account, "Mr. A", 500);
		new SyncTest(account, "Mr. B", 750);
		new SyncTest(account, "Mr. C", 345);
		new SyncTest(account, "Mr. D", 400);
	}

	public SyncTest(Account account, String name, int withDrawAmount){
		this.a = account;
		this.amount = withDrawAmount;
		
		Thread t = new Thread(this);
		t.setName(name);
		t.start();
	}
	

	@Override
	public void run() {
		a.withdraw(amount);
	}
}
