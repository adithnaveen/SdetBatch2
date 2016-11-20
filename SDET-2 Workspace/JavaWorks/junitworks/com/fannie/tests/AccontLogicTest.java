package com.fannie.tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fanni.businesslogic.AccountLogic;

public class AccontLogicTest {
	
	static AccountLogic acc = null;
	
	// this method will be invoked only once when the class is loaded 
	@BeforeClass
	public static void beforeClass(){
		acc = new AccountLogic();
	}

	/**
	 * @see To test method to insert account 
	 * The test methods are executed n number of times... 
	 */
	
	@Test
	public void accountInsertTest(){
		// this is good with jUnit 3.x
		// assertEquals("Testcase ", true	, ?);
		
		Assert.assertEquals(true, acc.insertAccount());
	}
	
	@Test
	public void getFullDetailsTest(){
		Assert.assertEquals("Account Not Found", acc.getFullDetails(544));
	}
}
