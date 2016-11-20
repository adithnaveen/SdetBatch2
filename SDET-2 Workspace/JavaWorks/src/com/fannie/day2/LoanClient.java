package com.fannie.day2;

public class LoanClient {
	public static void main(String[] args) {

		Loan loans[] = new Loan[4];

		loans[0] = new HomeLoan();
		loans[1] = new HomeLoan();
		loans[2] = new VehicleLoan();
		loans[3] = new HomeLoan();


		LoanDisplay.showLoans(loans);
		
		
		
		
		
		
		
		
		
		
		// other way using normal for loop

//		for (int i = 0; i < loans.length; i++) {
//			System.out.println(loans[i] instanceof HomeLoan ? "Home Loan" : "Vehicle Loan");
//
//			System.out.println("ROI : " + loans[i].getRoi());
//			System.out.println("Credit Score : " 
//					+ loans[i].creditScore());
//			loans[i].maxTenure();
//			System.out.println("++++++++++++++++++++++++++++++++++++");
//		}

	}
}
