package com.fannie.basics;

public class DefaultHello implements IHelloService{
	private String name;
	private String city;
	
	// Its good to have default constructor
	// if you dont have default constructor then use setters
	public DefaultHello(){
		System.out.println("constructor called... ");
	}

	public DefaultHello(String name, String city) {
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "DefaultHello [name=" + name + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String sayHello(String name, String city) {
		String myStrs[]={
				"Hey How are you Mr/Ms %s & Howz your city %s", 
				"Good Morning %s and heard you are in %s",
				"There is some thing good %s in your city %s"
		};
		
		int randNumber = (int) (Math.random() * 3);
		System.out.println("Random Number generated is " + randNumber);
		return String.format(myStrs[randNumber].toString(), name, city);
	}
	public String  sayHello() {
		return sayHello(name, city);
		
	}
	
	
	
	public void init(){
		System.out.println("Init in Default Hello");
	}
	
	
	public void destroy(){
		System.out.println("Destroy in Default Hello");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
