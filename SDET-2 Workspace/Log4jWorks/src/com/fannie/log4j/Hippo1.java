package com.fannie.log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Hippo1
{
	static Logger logger = Logger.getLogger(Hippo1.class);   
	public static void main(String args[]) 
	{      	
		PropertyConfigurator.configure("resources/log4j.properties");      

		logger.debug("Here is some DEBUG");      	
		logger.info("Here is some INFO");      	
		logger.warn("Here is some WARN");      	
		logger.error("Here is some ERROR");      	
	}
}



