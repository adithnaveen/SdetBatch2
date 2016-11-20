package com.fannie.annotations;

import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.fannie.hibernate02.HibernateUtils;

public class CustomerImpl {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getFactory("hibernate1.cfg.xml");
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Customer customer= new Customer();
		customer.setCustName("Tosha");
		customer.setCustEmail("tosha@fanniemae.com");
		customer.setCustSal(6500);
		customer.setDob(new GregorianCalendar(1984, 1, 20));
		customer.setPassword("testing112233");
		
		session.save(customer);
		session.getTransaction().commit();
		System.out.println("Saved Customer... ");
		
	}
}
