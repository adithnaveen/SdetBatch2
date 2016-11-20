package com.fannie.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteBuffere {
	public static void main(String[] args) 
			throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int empId;
		String empName;
		
		System.out.println("Enter Emp Id :");
		empId = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Emp Name : ");
		empName = br.readLine();
		
		System.out.println("Emp id " + empId);
		System.out.println("Emp Name " + empName);
		

		BufferedWriter bw = new BufferedWriter(new FileWriter("emp.txt",true));
		
		bw.write(new Integer(empId).toString());
		bw.write(empName);
		bw.newLine();
		
		bw.close();
		System.out.println("Data is Written...");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
