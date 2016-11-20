package com.fannie.day6;


// Singleton design pattern will have a constructor 
// of private, and this constructor cannot be access outside 
// the class, to access we shall have 1 public/protected/default 
// static method is required 
class Company{
	
	// The constructor will have the same name as class
	// no return type neither void 
	private Company(){
		System.out.println("constructor called.. ");
	}
	
	// the method becomes static because creating an object of the class 
	// is restricted, and static methods can be access without
	// creating an object.  And the method called getInstance takes 
	// object of Company class and returns company 
	
	
	public static Company getInstance (Company company){
		
		// if the company object got is null then we create an object 
		// if not we return the current object which is got
		
		if(company == null){
			return new Company();
		}
		return company;
	}
	
}


public class SingletonEx {
	public static void main(String[] args) {
		// this statement for the singleton does not hold good 
		// Company comp = new Company();
		
		Company comp = null;
		comp = Company.getInstance(comp);

		Company c1 = Company.getInstance(comp);
	}
}

















