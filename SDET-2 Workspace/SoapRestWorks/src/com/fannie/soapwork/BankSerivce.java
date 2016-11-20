package com.fannie.soapwork;

import javax.jws.WebService;

@WebService(
		endpointInterface="com.fannie.soapwork.IBankServer", 
		name="BankServer", 
		portName="BankServerPort", 
		serviceName="BankServerService", 
		targetNamespace="urn:fannie.bankserver/ws"
		)
public class BankSerivce implements IBankServer {

	@Override
	public String checkCreditScore(int score, String name) {
		String grade ="";
		if(score < 400){
			grade = "C";
		}else if(score >400 && score < 700){
			grade=  "B";
		}else if (score >= 700){
			grade = "A";
		}

		return "Mr/Ms/Mrs " + name +" your Credit grade is " + grade;
	}

	@Override
	public String applyLoan(int amout, String name) {
		
		if(amout < 10000){
			return "Loan Granted for Mr/Ms/Mrs:"+ name;
		}else{
			return "Sorry Not now for Mr/Ms/Mrs:"+ name;
		}
	}

}
