package com.fannie.day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		map.put("Lavanya", 2222);
		map.put("Tosha", 2345);
		map.put("Kumar", 2211);
		map.put("Sasi", 3322);
		

		Set mySet = map.entrySet();
		Iterator itr = mySet.iterator();
		
		while(itr.hasNext()){
			Map.Entry<String, Integer> temp = (Entry<String, Integer>) itr.next();
			
			System.out.println(temp.getKey() +", " + temp.getValue());
		}
		

	}
}
