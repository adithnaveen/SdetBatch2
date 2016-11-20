package com.fannie.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormTest {
	 private WebDriver driver;
	  private String baseUrl;
	 
	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "file:///C:/Users/Lenovo/Desktop/Bootstrap-/Bootstrap/forms.html";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  
	  
	 @Test
	  public void checkRadio(){
		  driver.get(baseUrl);
		  WebElement radioBtnMale =
		 driver.findElement(By.xpath
				("html/body/div[1]/div[2]/div[1]/form/div[5]/label[1]/input"));
		  radioBtnMale.click();
		  
		  try {
			Thread.sleep(1400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		 WebElement radioBtnFemale = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[5]/label[2]/input"));
		 radioBtnFemale.click();
		 
		  try {
			Thread.sleep(1400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		 
		 radioBtnMale.click();
		 System.out.println("Male Selected : " + radioBtnMale.isSelected());
		 System.out.println("Female Selected : " + radioBtnFemale.isSelected());
		  
	  }

	  @Test
	  public void ListOfElements(){
		  driver.get(baseUrl);
		  List<WebElement> radioButtons = 
		  driver.
		  findElements(By.xpath
				("//input[contains(@type, 'radio')]"));
		  
		  int size = radioButtons.size();
		  
		  System.out.println("Number of Radio Buttons are " + size);
		  boolean isChecked = false;
		  for(int i=0; i<size; i++){
			  isChecked = radioButtons.get(i).isSelected();
			  
			  if(!isChecked){
				  radioButtons.get(i).click();
				  try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			  }
		  }
	  }

}

// //input[contains(@type, 'radio') and contains(@name='sex')]








