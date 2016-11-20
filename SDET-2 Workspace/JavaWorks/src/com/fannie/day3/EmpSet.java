package com.fannie.day3;

import java.util.HashSet;

public class EmpSet {
	public static void main(String[] args) {
		HashSet<Employee> set = new HashSet<Employee>();
		
		set.add(new Employee(101, "Kumar", 10000));
		set.add(new Employee(103, "Virgil", 20000));
		set.add(new Employee(212, "Kanchan", 15000));
		set.add(new Employee(212, "Kanchan", 15000));
		set.add(new Employee(212, "Kanchan", 15000));

			
		for(Employee temp : set){
			System.out.println(temp +", " + temp.hashCode());
		}
	
	}
}
