package com.fannie.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fannie.beans.Greetings;

@Path("/hello")
public class HelloResource {
/*	@GET
	@Produces("text/html")
	public String sayHello(){
		return "<html><body><h2>Welcome to REST Services</h2></body></html>";
	}
	
*/

	/*
	@GET
	@Produces("application/xml")
	public String sayHelloXML(){
		return "<?xml version='1.0'?><message>Welcome to REST</message>";
	}
	*/
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Greetings sayHelloJSON(){
		return new Greetings("Scott", "Hello Web Service");
	}
}
