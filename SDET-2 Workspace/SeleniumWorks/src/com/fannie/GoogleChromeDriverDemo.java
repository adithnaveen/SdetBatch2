package com.fannie;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChromeDriverDemo {
	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html?path=2.24/
		
		String baseUrl = "http://google.com";
		WebDriver driver ; 
		
	System.
	setProperty("webdriver.chrome.driver", 
	"C:\\SDET Training - 2 Materials"+File.separator+"seleniumstuffs\\chromedriver_win32\\chromedriver.exe");

	driver = new ChromeDriver();
	
	driver.get(baseUrl);
	
	driver.manage().window().maximize();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();
	
	}
}
