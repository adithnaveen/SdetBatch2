package com.fannie.day2;

public class ExceptionEx3 {
	
	public static void checkName(String name) 
			throws RuntimeException{
		if(name == null){
			throw new RuntimeException("Sorry Your name cannot be blank");
		}else{
			System.out.println("Name Validated... ");
		}
	}
	
	
	public static void checkSal(String name, int sal) 
			throws Exception{
		try{
			checkName(name);
		}catch(RuntimeException rte){
			throw new Exception("This msg is from checksal", rte);
		}
		if(sal<10000){
			throw new Exception("Sorry Salary Cannot be less than 10k");
		}
		
	}
	
	public static void main(String[] args) {
		String name = null;
		int sal = 3000;

		try {
			checkSal(name, sal);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Some business logic");
		
		
	}
}
