package com.fannie.annotations.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fannie.hibernate02.HibernateUtils;

public class ProjectImpl {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		
		config.configure("hibernate1.cfg.xml");
		
		config.addAnnotatedClass(Project.class);
		config.addAnnotatedClass(Module.class);
		config.addAnnotatedClass(Task.class);
		
		Project proj = new Project();
		proj.setPrjId(101);
		proj.setPrjName("Banking");
		
		Module mod = new Module();
		mod.setPrjId(102);
		mod.setPrjName("Insurance");
		mod.setModuleName("Health Insurance");
		
		Task task = new Task();
		task.setPrjId(103);
		task.setPrjName("Programming");
		task.setModuleName("OO Programming");
		task.setTaskName("Java Programming");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		session.save(proj);
		session.save(mod);
		session.save(task);
		
		session.getTransaction().commit();
		
		System.out.println("Saved... ");
		
		
		
	}
}
