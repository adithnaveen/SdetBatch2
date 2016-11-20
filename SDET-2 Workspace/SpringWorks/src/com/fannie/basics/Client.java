package com.fannie.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
//		XmlBeanFactory factory = 
//			new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
//		ApplicationContext context = 
//			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AbstractApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		IHelloService hello = (IHelloService) context.getBean("hello");
		
		System.out.println(hello.sayHello());
		
		
		IHelloService hello1 = context.getBean("hello", IHelloService.class);
		System.out.println(hello1.sayHello());

		context.registerShutdownHook();
		
		
	}
}
