package com.fannie;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * selenium can help to open the request on any browser 
by default we have firefox available 
 *
 */
public class FireFoxDriverDemo {
	public static void main(String[] args) {
		// the driver now holds the reference for firefox browser 
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WIN8);

		// The firefox can take capabalities as a paramenter to know 
		// what parameters are set 
		WebDriver driver = new FirefoxDriver(caps);
		String url ="http://google.com";

		
		driver.get(url);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
}
