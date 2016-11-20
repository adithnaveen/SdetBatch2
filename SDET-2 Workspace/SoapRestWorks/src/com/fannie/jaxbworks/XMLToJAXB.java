package com.fannie.jaxbworks;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLToJAXB {
	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				
		Customer customer = (Customer) 
			jaxbUnmarshaller.unmarshal(new File("Customer.xml"));
		
		System.out.println("Customer id " + customer.getId());
		System.out.println("Customer Name " + customer.getName());
		System.out.println("Customer Age " + customer.getAge());
		System.out.println("Salutation "  + customer.getSalutation());
	}
}
