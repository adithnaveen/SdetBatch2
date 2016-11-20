package com.fannie.day2;

public class LoanDisplay {
	public static void showLoans(Loan [] loans){

		for (Loan temp : loans) {
			System.out.println(temp instanceof HomeLoan 
					? "Home Loan" : "Vehicle Loan");
			System.out.println("ROI :" + temp.getRoi());
			System.out.println("Credit Score :" + temp.creditScore());
			// concrete methods from loan class
			temp.maxTenure();

			System.out.println("----------------------------");
		}

	}
}
