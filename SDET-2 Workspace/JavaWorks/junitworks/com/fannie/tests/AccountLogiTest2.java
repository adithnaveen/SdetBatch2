package com.fannie.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fanni.businesslogic.AccountLogic;

public class AccountLogiTest2 {

	static AccountLogic  al = null;
	

	@BeforeClass
	public static void beforeCaseAccountLogicTest2(){
		System.out.println("Before class account logic test 2");
		al = new AccountLogic();
		
	}
	
	
	@Before
	public void beforegetNoOfAcconts(){
		System.out.println("Before Get No of Account ");
	}
	
	
	@Test(timeout=300)
	public void getNoOfAccontsTest(){
		Assert.assertEquals(100, al.getNoOfAcconts());
	}

	@Test
	public void hiTest(){
		Assert.assertEquals("hi", "hi");
	}
	
	
}
