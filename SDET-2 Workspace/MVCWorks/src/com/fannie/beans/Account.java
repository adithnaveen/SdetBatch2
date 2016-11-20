package com.fannie.beans;

public class Account {
	private int accId;
	private String accType;
	private double balance;
	
	public Account(){}
	public Account(int accId, String accType, double balance) {
		super();
		this.accId = accId;
		this.accType = accType;
		this.balance = balance;
	}
	
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
