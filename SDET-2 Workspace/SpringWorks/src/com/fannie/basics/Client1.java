package com.fannie.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client1 {
	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext
				("applicationContext.xml", 
				 "applicationContext2.xml", 
				 "applicationContext3.xml");
		
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println("Emp Id " + emp.getEmpId());
		System.out.println("Emp Name " + emp.getEmpName());
		System.out.println("Address Street "+ emp.getAddress().getStreet());
		
	}
}
