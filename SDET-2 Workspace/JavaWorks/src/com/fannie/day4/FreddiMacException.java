package com.fannie.day4;
// hirerchy 
// Object -> Throwable -> Exception -> FannieMaeException

// this checked exception 
public class FreddiMacException extends Exception{
	String msg;

	public FreddiMacException(){
		msg = "Sorry Loan Not Processed";
	}
	
	public FreddiMacException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "FreddiMacException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		return ":::::::: "+ msg;
	}
}


