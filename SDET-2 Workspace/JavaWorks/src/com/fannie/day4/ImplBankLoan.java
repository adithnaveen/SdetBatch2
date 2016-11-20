package com.fannie.day4;

public class ImplBankLoan {
	
	public static void showLoanDetails(BankLoan[] loans){
		int totalAmount = 0; 
		for(BankLoan temp : loans){
			// to get loan amount repay of only mortgage amount 
			if(temp instanceof Mortagage)
				totalAmount += temp.getAmount();
		}
		
		System.out.println("Total Amount to be paid is " + totalAmount);
	}
	
	public static void main(String[] args) {

		BankLoan loans[] = new BankLoan[3];
		
		loans[0] = new Mortagage();
		loans[1] = new Personal();
		loans[2] = new Mortagage();
		
		loans[0].loanAmount(1000);
		loans[1].loanAmount(2000);
		loans[2].loanAmount(3000);

		
		showLoanDetails(loans);
		loans[0].repay(100);
		showLoanDetails(loans);
	}
}
