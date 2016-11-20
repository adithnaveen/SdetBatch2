package com.fannie.day2;

public class AccountClient {
	public static void main(String[] args) {
		Account accs [] = new Account[4];
		
		accs[0] = new Account("Lavanya", 10000);
		accs[1] = new Account("Vani", 11000);
		accs[2] = new Account("Sasi", 13000);
		accs[3] = new Account("Chandraban", 14000);
		

		
		for(Account temp : accs){
			System.out.println(temp);
		}
	}
}
