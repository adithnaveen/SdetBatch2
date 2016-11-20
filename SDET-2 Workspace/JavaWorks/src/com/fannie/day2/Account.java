package com.fannie.day2;

public class Account {
	private int accountId;
	private String name;
	private double balance;
	
	private static int sId=100;

	
	
	
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", balance=" + balance + "]";
	}

	public Account(String name, double balance) {
		super();
		this.accountId = sId++;
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public static int getsId() {
		return sId;
	}
	
	
	
}
