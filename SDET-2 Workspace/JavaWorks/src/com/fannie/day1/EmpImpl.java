package com.fannie.day1;

public class EmpImpl {
	public static void main(String[] args) {
		Emp e = new Emp();

		e.setEmpId(101);
		e.setEmpName("Hars");
		e.setEmpSal(3000);

		System.out.println("Emp Is " + e);
		System.out.println(e.hashCode());
		
		
		// System.out.println("Emp Is " + e);
		
	}
}
