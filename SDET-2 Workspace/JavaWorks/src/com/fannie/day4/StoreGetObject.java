package com.fannie.day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StoreGetObject {

	public static void storeStudent() throws IOException {
		Student student = new Student(101, "Kanchan");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
		oos.writeObject(student);

		oos.close();
		System.out.println("Data Written successfully... ");

	}

	public static void getStudent() 
		throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));

		Student stu = (Student) ois.readObject();
		
		System.out.println("Data got from file is ");
		System.out.println(stu);
	}

	public static void main(String[] args) {

			try {
				getStudent();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
