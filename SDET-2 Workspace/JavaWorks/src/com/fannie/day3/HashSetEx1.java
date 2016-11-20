package com.fannie.day3;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		System.out.println(hs.add("Vani"));
		System.out.println(hs.add("Sasi"));
		System.out.println(hs.add("Tosha"));
		System.out.println(hs.add("Gopinath"));

		System.out.println(hs);
		
		System.out.println("================================");
		
		TreeSet<String> ts = new TreeSet<String>();
		

		System.out.println(ts.add("Vani"));
		System.out.println(ts.add("Sasi"));
		System.out.println(ts.add("Tosha"));
		System.out.println(ts.add("Gopinath"));

		System.out.println(ts);
		
	}
}
