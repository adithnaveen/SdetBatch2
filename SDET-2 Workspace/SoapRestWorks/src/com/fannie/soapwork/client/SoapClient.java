package com.fannie.soapwork.client;

import java.io.IOException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.fannie.soapwork.IBankServer;

public class SoapClient {
	public static void main(String[] args) throws IOException {
		String wsdl ="http://127.0.0.1:6789/fannie?wsdl";
		String serviceName = "BankServerService";
		String tns = "urn:fannie.bankserver/ws";
		
		URL url= new URL(wsdl);
		QName qname = new QName(tns, serviceName);
		
		Service service = Service.create(url, qname);
		
		IBankServer server = service.getPort(IBankServer.class);
		
		System.out.println(server.checkCreditScore(500, "Tim"));
		System.out.println(server.applyLoan(40000, "John"));
		

	}
}
