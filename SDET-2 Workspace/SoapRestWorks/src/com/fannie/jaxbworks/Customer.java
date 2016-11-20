package com.fannie.jaxbworks;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private String salutation;
	private int id;
	private String name;
	private int age;
	
	public Customer(){}
	
	public Customer(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	public String getSalutation() {
		return salutation;
	}
	@XmlAttribute
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	
}
