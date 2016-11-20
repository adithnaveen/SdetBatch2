package com.fannie.day4;

// contracts are defined here 
public interface BankLoan {
	int maxTenure = 30;
	public void loanAmount(int amount);
	public void repay(int amount);
	public void foreClosure();
	
	
	// to calculate the total amount which is to be repaid
	public int getAmount();
}
