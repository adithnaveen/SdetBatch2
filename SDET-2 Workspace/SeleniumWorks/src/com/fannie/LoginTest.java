package com.fannie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	public static void main(String[] args) {
		String url ="https://sdettraining.litmos.com/account/login/";
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.id("Username")).clear();
		driver.findElement(By.id("Username")).sendKeys("testing@test.com");
		driver.findElement(By.id("Password")).sendKeys("hello");
		driver.findElement(By.id("login-button")).click();
	}
}
