package com.fannie.day2;

public class HomeLoan extends Loan{

	@Override
	public int getRoi() {
		return 4;
	}

	@Override
	public int creditScore() {
		return 700;
	}

}
