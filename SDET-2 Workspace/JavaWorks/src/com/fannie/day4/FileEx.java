package com.fannie.day4;

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {
		// this doesn't create the file it only points 
		File f = new File("test1.txt");
		
		
		//  System.out.println(f.createNewFile());
//		if(f.exists()){
//			System.out.println("Deleting file ");
//			f.delete();
//		}
		
		
		System.out.println("can reable : " + f.canRead());
		System.out.println("Can Writeable : " + f.canWrite());
		System.out.println("Is file "+ f.isFile());
		
	}
}
