package com.fannie.day6;

import static com.fannie.day5.Account.*;


public class ClientSomeBusiness {
	public static void main(String[] args) {
		something();
		
		try {
			Class.forName("com.fannie.day6.SomeBusiness");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
