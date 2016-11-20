package com.fannie.basics;

public class Address {
	private int hNo;
	private String street;
	private int pin;
	
	public Address(){}
	
	public Address(int hNo, String street, int pin) {
		super();
		this.hNo = hNo;
		this.street = street;
		this.pin = pin;
	}
	
	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
