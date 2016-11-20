package com.fannie.day2;

public class UserDefExceptionImpl {

	public static void checkCreditScore(String name, int cScore) throws FannieMaeException {

		if (cScore < 300) {
			throw new FannieMaeException(
					"Sorry You cannot apply for Loan, please review " 
							+ "with our team Mr/Mrs/Ms " + name);
			
		} else if (cScore >= 300 && cScore < 700) {
			throw new FannieMaeException("Please give us sometime for " 
					+ "reviewing Mr/Ms/Mrs " + name);
		
		} else {
			System.out.println("Congrats Your loan can be processed "
					+ "please submit documents Mr/Ms/Mrs: " + name);
		}
	}

	public static void main(String[] args) {
		try {
			checkCreditScore("Tim", 345);
		} catch (FannieMaeException e) {
			e.printStackTrace();
		}
		
		
	}
}
