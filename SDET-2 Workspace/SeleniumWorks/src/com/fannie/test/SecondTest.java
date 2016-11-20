package com.fannie.test;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTest {
  private WebDriver driver;
  private String baseUrl;
 

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSecond() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("best place to buy iwatch");
    driver.findElement(By.name("btnG")).click();
  }

  @After
  public void tearDown() throws Exception {
   //  driver.close();
    
  }

}
