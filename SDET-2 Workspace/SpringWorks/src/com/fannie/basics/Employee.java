package com.fannie.basics;

public class Employee {
	private int empId;
	private String empName;
	private Address address;
	
	public Employee(){
		System.out.println("in employee constructor... ");
	}
	
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
		this.empName = empName;
	}
	
	public void myInit(){
		System.out.println("My init in Employee called... ");
	}
	
	public void myDestroy(){
		System.out.println("My Destroy in Employee Called... ");
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
