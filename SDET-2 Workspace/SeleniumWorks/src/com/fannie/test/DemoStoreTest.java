package com.fannie.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoStoreTest {
	 private WebDriver driver;
	  private String baseUrl;
	 

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://demostore.x-cart.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void testWebPage(){
		  // xpath for shipping -> //*[@id="header-area"]/div[1]/div/div[4]/div/ul/li[3]/a/span
		  driver.get(baseUrl);
		  
		  driver.findElement(By.linkText("Shipping")).click();
		  
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.className("company-logo")).click();
	  }
	  
	  
	  
}
