package com.fannie.day4;

import java.io.File;

public class FileProperties {
	public static void main(String[] args) {
		File f = new File("hello");
		
		File files[] =  f.listFiles();
		
		for(File temp : files){
			
				System.out.println(temp.getName() +", " + temp.length());
			
		}
		
		
	}
}
