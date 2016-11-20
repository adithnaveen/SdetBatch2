package com.naveen;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginValidate extends ActionSupport {
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
		
		if(isInvalid(getUserName()))
			return INPUT;
		
		if(isInvalid(getPassword()))
			return INPUT;
		return SUCCESS;
		
	}
	
	public boolean isInvalid(String value){
		
		if(value==null || value.length()<1)
			return true;
		return false;
	}
	
	
}
