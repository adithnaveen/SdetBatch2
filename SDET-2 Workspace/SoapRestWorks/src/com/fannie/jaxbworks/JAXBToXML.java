package com.fannie.jaxbworks;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBToXML {
	public static void main(String[] args) throws JAXBException {
		Customer cust = new Customer(101, "Kanchan", 16);
		cust.setSalutation("Ms");
		File file = new File("Customer.xml");
		
		// JAXBContext class provides the entry point to JAXB API 
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		
		// we we put the data to xml file it is called as marshall 
		Marshaller marshal = jaxbContext.createMarshaller();
		
		// to make sure they are indented or look pretty 
		marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshal.marshal(cust, System.out);
		marshal.marshal(cust, file);
		System.out.println("Written successfully.... ");
	}
}
