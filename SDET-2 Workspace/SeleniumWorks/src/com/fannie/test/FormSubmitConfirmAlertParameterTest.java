package com.fannie.test;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

@RunWith(value = Parameterized.class)
public class FormSubmitConfirmAlertParameterTest {

	WebDriver driver;
	String baseURL;

	// instance variable 
	// to show working of parameters 
	private String name;
	private String email;
	private String message;
	private String expectedMessage;
	
	
	
	
	public FormSubmitConfirmAlertParameterTest
	(String name, String email, String message, String expectedMessage) {
		this.name = name;
		this.email = email;
		this.message = message;
		this.expectedMessage = expectedMessage;
	}
	
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{
			{"Gopinath", "Gopi@gmail.com", "Testing From Gopi", "Hurray Submitted"}, 
			{"Lavanya", "Lavanya@yahoo.com", "Testing From Lavanya", "Hurray Submitted"},
			{"Vani", "vani@fannimae.com", "Testing from Vani", "Failed Case"}
		}); 
	}
	
	

	@Before
	public void setUp() {
		
		System.
		setProperty("webdriver.chrome.driver", 
		"C:\\SDET Training - 2 Materials"+File.separator+"seleniumstuffs\\chromedriver_win32\\chromedriver.exe");

		baseURL = "file:///C:/Users/Lenovo/Desktop/Bootstrap-/Bootstrap/forms.html";
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test(){
		driver.get(baseURL);
		driver.findElement(By.id("formName")).sendKeys(this.name);
		driver.findElement(By.id("formEmail")).sendKeys(this.email);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[3]/textarea")).sendKeys(this.message);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/button")).click();

		Alert confirm = driver.switchTo().alert();
		System.out.println(confirm.getText());
		confirm.accept();
		
		Alert alert  = driver.switchTo().alert();
		String actualResult = alert.getText();

		alert.accept();
		Assert.assertEquals( actualResult, 
					this.expectedMessage ,"Test Case for Sasi");
	}

	@After
	public void tearDown() {
		driver.close();
	}
}
