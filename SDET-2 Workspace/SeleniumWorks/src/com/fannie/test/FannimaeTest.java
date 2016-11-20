package com.fannie.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FannimaeTest {
	 private WebDriver driver;
	  private String baseUrl;
	 

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://fanniemae.com/portal/index.html";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void test(){
		  driver.get(baseUrl);
		  System.out.println("Title is " + driver.getTitle());
		  
		  String currentURL = driver.getCurrentUrl();
		  System.out.println("current URL :" + currentURL);
		  
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		 driver.findElement(By.xpath("//*[@id='nav_list_item_2']/a")).click();
		 

		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.findElement(By.xpath("//*[@id='nav_2a']/ul/li[3]/a")).click();
			 
		  System.out.println("Currentyly ->  " + driver.getCurrentUrl());
		  
		  String newUrl ="http://yahoo.com";
		  driver.navigate().to(newUrl);

		  System.out.println("Currently  -> " + driver.getCurrentUrl());
		  
		  driver.navigate().back();
		  
		  System.out.println("Currently  -> " + driver.getCurrentUrl());
		  
		 // to refresh 
		  driver.navigate().refresh();
		 System.out.println("URL After Refresh -> " + driver.getCurrentUrl());
		 
		 driver.navigate().forward();
		 System.out.println("URL after forward -> " + driver.getCurrentUrl());
		 
		 
		 
	  }
	
	  
	  
	  
	  // then naviage to yahoo.com 
	

}
