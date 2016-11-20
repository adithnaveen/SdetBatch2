package com.fannie.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeImpl {
	SessionFactory sessionFactory;
	public static void main(String[] args) {
		
		EmployeeImpl impl = new EmployeeImpl();
	// 	int empId = impl.addEmployee(null, "Scott", 2200);
		
	// 	System.out.println("empid got is " + empId);
		
		impl.getAllEmployee1();
	}
	
	
	
	
	public Integer addEmployee(Integer empId, String empName, int salary){
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx = null;
		Integer employeeId = null;
		try {
			tx = session.beginTransaction();
			Employee e = new Employee(empName, salary);
			// save will not save the data to db 
			// instead it will make persisted 
			employeeId =(Integer) session.save(e);
			
			// actual save 
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return employeeId;
	}



	public void getEmployee(int empId){
	sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employee temp;
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
//			temp = (Employee) session.get(Employee.class, empId);
			temp = (Employee) session.load(Employee.class, empId);
			
			System.out.println(" Name is " + temp.getEmpName());
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	

	
	
	public void getAllEmployee(){
		Session session = sessionFactory.openSession();
		try {
			Transaction tx = session.beginTransaction();
			
			List employees = session.createQuery("FROM com.naveen.hibernateworks.Employee").list();
			
			for(Iterator itr = employees.iterator(); itr.hasNext(); ){
				Employee temp = (Employee) itr.next();
				
				System.out.println("Emp Id is "  + temp.getEmpId() +"\nEmp Name is " + 
						temp.getEmpName() +"\nEmp Salary is " + temp.getSalary());
			}
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void getAllEmployee1(){
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			Criteria cr = session.createCriteria(Employee.class);
			
			List<Employee> list = cr.list();
			
			for(Employee temp : list){
				System.out.println(temp.getEmpId() +", "
					+ temp.getEmpName() +", "+ temp.getSalary());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
