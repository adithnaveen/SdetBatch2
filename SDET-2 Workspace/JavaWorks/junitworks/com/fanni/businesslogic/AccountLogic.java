package com.fanni.businesslogic;

class Account{}
public class AccountLogic {
	// assume that this class will have business logic 
	// this class may be wrapper /  service  / DAO 
	
	public boolean insertAccount(){
		return true;
	}
	
	public Account getAccount(){
		return new Account();
	}
	
	public int getNoOfAcconts(){
		try {
			Thread.sleep(330);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return 100;
	}
	
	public String getFullDetails(int val){
		if(val < 500){
		return "FannieMae-Reston";
		}else {
			return "Account Not Found";
		}
	}
}
