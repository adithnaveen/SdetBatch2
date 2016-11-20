package com.fannie.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	static SessionFactory factory = null;
	private static ServiceRegistry serviceRegistry;

	@SuppressWarnings({ "deprecation" })
	public static SessionFactory getSessionFactory(){
		
		// by default looks for hibernate.cfg.xml
		serviceRegistry = new ServiceRegistryBuilder().applySettings(
	            new Configuration().configure().getProperties()).build();
	    factory = new Configuration().configure().buildSessionFactory(serviceRegistry);
	    return factory;
		// return new Configuration().configure().buildSessionFactory();
	}
	
	
}
