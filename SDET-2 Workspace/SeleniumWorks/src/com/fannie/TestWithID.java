package com.fannie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWithID {
	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new FirefoxDriver();
		String url = "http://google.com";
		driver.get(url);
		
		driver.findElement(By.id("lst-ib")).sendKeys("best place to live");
		// xpath for button -> //*[@id='sblsbb']/button
	//	driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();
		
		// to click based on name -> //*[@name='btnG'] 
		driver.findElement(By.name("btnG")).click();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
	}
}
