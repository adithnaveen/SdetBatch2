package com.fannie.day3;

import java.util.ArrayList;
import java.util.Iterator;

// raw type which can hold anything and everything 

public class ArrayListEx1 {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		
		list.add(10); // list.add(new Integer(10));
		list.add("Hi");
		list.add(true);
		list.add(new Object());
		
		
		Iterator itr =  list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------------");
		
		for(Object temp : list){
			System.out.println(temp);
		}
		
		System.out.println("++++++++++++++++++++++++++++");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
	}
}
