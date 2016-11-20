package com.fannie.day1;

// a bean class is a class which has default constructor 
// private variables and public getters and setters 
public class Emp {
	// private variables are accessed within the class
	private int empId;
	private String empName; // -> String empName = new String();
	private double empSal;

	
	
	
	// the constructor is the one which has the same name
	// as the class name and no return type

	// if you dont have the constructor then java compiler
	// when compiles the code it will create a default
	// constructor which does not take any parameter

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		if (empName.length() < 5) {
			this.empName = "NO NAME";
		} else {
			this.empName = empName;
		}
	}

	public double getEmpSal() {

		return empSal;
	}

	public void setEmpSal(double empSal) {
		if (empSal < 5000) {
			System.out.println("Sorry Salary Set to 5000");
			this.empSal = 5000;
		} else {
			this.empSal = empSal;
		}
	}


	
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public Emp() {
		super();
	}
}






/*
 * public Emp extends Object{ public Emp(){ super(); } }
 */
