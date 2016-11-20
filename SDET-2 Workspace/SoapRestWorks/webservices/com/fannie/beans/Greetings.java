package com.fannie.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greetings {
	private String name;
	private String message;
	
	public Greetings(String name, String message){
		this.name = name;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
