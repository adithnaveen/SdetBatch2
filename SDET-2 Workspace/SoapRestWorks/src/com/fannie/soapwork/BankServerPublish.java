package com.fannie.soapwork;

import javax.xml.ws.Endpoint;

public class BankServerPublish {
	public static void main(String[] args) {
		String publishAddres = "http://127.0.0.1:6789/fannie";
		
		Endpoint.publish(publishAddres, new BankSerivce());
		
		System.out.println("published on " + publishAddres);
		System.out.println("WSDL " + publishAddres+"?wsdl");
	}
}
