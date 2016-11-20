package com.fannie.day4;
// hirerchy 
// Object -> Throwable -> Exception -> FannieMaeException

// this checked exception 
public class FannieMaeException extends Exception{
	String msg;

	public FannieMaeException(){
		msg = "Sorry Loan Not Processed";
	}
	
	public FannieMaeException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "FannieMaeException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		return ":::::::: "+ msg;
	}
}


