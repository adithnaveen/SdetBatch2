package com.fannie.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.fannie.hibernate02.HibernateUtils;

public class EmployeeImpl {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getFactory("hibernate1.cfg.xml");
		
		Session session = factory.openSession();
		
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("virgil");
		emp.setEmpSal(6000);
		
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		
		System.out.println("Saved Employee Record... ");
	}
}
