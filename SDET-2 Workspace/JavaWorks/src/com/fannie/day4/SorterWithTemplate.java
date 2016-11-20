package com.fannie.day4;

import java.util.ArrayList;

public class SorterWithTemplate {
	public static void main(String[] args) {
		ArrayList<Laptop> laps = new ArrayList<Laptop>();

		laps.add(new Laptop(888, "lepnovo", 44455));
		laps.add(new Laptop(33, "apple", 4567));
		laps.add(new Laptop(12, "dell", 8877));
		laps.add(new Laptop(400, "micro soft", 2134));
		laps.add(new Laptop(345, "chrome", 2000));

		
		TemplateSorter.sortNameAsc(laps, ISorterConsts.NAME_ASC);
		
		for(Laptop temp : laps){
			System.out.println(temp);
		}
		
	}
}
