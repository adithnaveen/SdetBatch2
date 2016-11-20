package com.fannie.day4;

public class Personal implements BankLoan {
	int amount;
	
	public int getAmount() {
		return amount;
	}

	@Override
	public void loanAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public void repay(int amount) {
		this.amount = this.amount - amount;
	}

	@Override
	public void foreClosure() {
		System.out.println("If you repay you will be charged extra 1.4%");
	}

}
