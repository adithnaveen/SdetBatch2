package com.fannie.FannieTest;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.restful.beans.Message;

public class MessageTest {
	@Ignore
	public void makeGoogleTest(){
		String url="http://google.com";
		given()
			.when()
			.get(url)
		.then()
			.statusCode(200).toString();
	}
	@BeforeClass
	public static void init(){
		RestAssured.baseURI="http://localhost:9090/SoapRestWorks/resources/message";
	}
	
	// @Test
	public void getAllMessageTest(){
		when().
			get().then().statusCode(200).body("", is(empty()));
	}
	
	@Ignore
	public void postMessageTest(){
		Message message = new Message(202, "Testing From Rest Assured, Again!!!", "Tosha");
		given()
			.contentType(ContentType.JSON)
			.body(message)
		.when().post().then().statusCode(200)
			.body("messageId", is(message.getMessageId()))
			.body("msg", is(message.getMsg()))
			.body("author", is(message.getAuthor()));
	}
	
	// @Test
	public void postMessageCompleteTest(){
		Message message = new Message(300,
					"BLAH BLAH BLAH ", "Peter");
		
		Integer messageId = given()
			.contentType(ContentType.JSON)
			.body(message)
		.when().post().then().statusCode(200)
			.body("messageId", is(message.getMessageId()))
			.body("msg", is(message.getMsg()))
			.body("author", is(message.getAuthor()))
		.extract()
			.path("messageId");
		
		// to get the value 
		given().pathParam("messageId", messageId)
		.when().get("/{messageId}")
		.then()
			.statusCode(200)
			.body("messageId", is(message.getMessageId()))
			.body("msg", is(message.getMsg()))
			.body("author", is(message.getAuthor()));
		
		
	}
	
	
	// @Test
	public void getMessageTest(){
		int messageId= 5501;
		
		Message message = new Message();
		// to get the value 
		given().pathParam("messageId", messageId)
		.when().get("/{messageId}")
		.then()
			.statusCode(200)
			.body("messageId", is(message.getMessageId()))
			.body("msg", is(message.getMsg()))
			.body("author", is(message.getAuthor()));
		
	}
	

	
	@Test
	public void deleteMessageTest(){
		int messageId= 101;
		
		// to get the value 
		given().pathParam("messageId", messageId)
		.when().delete("/{messageId}")
		.then()
			.statusCode(201)
			.body("message", is("Found And Deleted -" + messageId));
			
		
	}
}
