package com.fannie.day4;

public class Mortagage implements BankLoan {

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
		System.out.println("You will be charged Extra 1.2%");
	}

}
