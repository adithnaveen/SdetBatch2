package com.fannie.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.fannie.basics.Employee;

public class MyPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// it is possible now to manipulate, the object here 
		System.out.println("Arg1 :::::::::: " +arg1);
		if(arg0 instanceof Employee){
			Employee emp= (Employee) arg0;
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp;
		}
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		
		System.out.println("in before init post processor");
		return arg0;
	}

}
