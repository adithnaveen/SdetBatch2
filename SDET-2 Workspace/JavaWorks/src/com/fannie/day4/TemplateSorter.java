package com.fannie.day4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


interface ISorterConsts{
	int NAME_ASC= 1;
	int NAME_DESC = 2;
	int priceAsc = 3;
	int priceDesc = 4;
}


public class TemplateSorter {

	public static List<Laptop> sortNameAsc(List<Laptop> laptops, int sortInfo) {
		Collections.sort(laptops, new Comparator<Laptop>() {
			@Override
			public int compare(Laptop arg0, Laptop arg1) {
				if(sortInfo ==1 ){
				return arg0.getName().compareTo(arg1.getName());

				}else if(sortInfo == 2){
					return arg1.getName().compareTo(arg0.getName());
				}
				return 0;
			}
		});
		return laptops;
	}
	
	
	
	
}
