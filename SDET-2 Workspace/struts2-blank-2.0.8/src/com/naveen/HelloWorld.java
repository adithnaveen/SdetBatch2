package com.naveen;

import com.opensymphony.xwork2.ActionSupport;


public class HelloWorld extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public String execute() throws Exception {
// may call DAO 
		this.setMessage("This is Hello From Naveen");
		return SUCCESS;
	}
	
	
	
}
