package com.fannie.soapwork;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IBankServer {
	@WebMethod
	public String checkCreditScore(int score, String name);
	
	
	@WebMethod
	public String applyLoan(int amout, String name);
}
