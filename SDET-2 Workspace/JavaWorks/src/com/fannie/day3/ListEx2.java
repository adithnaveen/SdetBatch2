package com.fannie.day3;

import java.util.ArrayList;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		System.out.println("Before Size is " + list.size());
		list.add("Virgil");
		list.add("Kiran");
		list.add("Gnanavalli");
		list.add("Daniel");
		list.add("Suresh");

		System.out.println("Before Size is " + list.size());

		System.out.println(list);
		list.add(2, "Shalabh");
		System.out.println(list);

		list.remove(2);

		System.out.println(list);

		for (String temp : list.subList(3, list.size())) {
			System.out.println(temp.toUpperCase());
		}
	}
}
