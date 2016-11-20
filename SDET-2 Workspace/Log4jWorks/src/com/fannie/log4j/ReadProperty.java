package com.fannie.log4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileReader(new File("c:\\repo\\db.properties")));
		
		
		System.out.println(prop.getProperty("db.username"));
		System.out.println(prop.getProperty("db.password"));
		
	}
}
