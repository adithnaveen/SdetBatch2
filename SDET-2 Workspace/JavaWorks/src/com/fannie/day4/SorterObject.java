package com.fannie.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Laptop implements Comparable<Laptop>, Comparator<Laptop> {
	private int laptopId;
	private String name;
	private double price;

	public Laptop() {}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", name=" + name + ", price=" + price + "]";
	}

	public Laptop(int laptopId, String name, double price) {
		super();
		this.laptopId = laptopId;
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Laptop o) {
		return (int) (this.price - o.getPrice());
	}

	@Override
	public int compare(Laptop o1, Laptop o2) {
		return (int) (o2.getPrice() - o1.getPrice());
	}
}

class SortLaptopName implements Comparator<Laptop> {

	@Override
	public int compare(Laptop o1, Laptop o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

public class SorterObject {
	public static void main(String[] args) {

		ArrayList<Laptop> laps = new ArrayList<Laptop>();

		laps.add(new Laptop(888, "lepnovo", 44455));
		laps.add(new Laptop(33, "apple", 4567));
		laps.add(new Laptop(12, "dell", 8877));
		laps.add(new Laptop(400, "micro soft", 2134));
		laps.add(new Laptop(345, "chrome", 2000));

		
		Collections.sort(laps);

		for (Laptop temp : laps) {
			System.out.println(temp);
		}

		System.out.println("===============================");

		Collections.sort(laps, new SortLaptopName());

		for (Laptop temp : laps) {
			System.out.println(temp);
		}

		System.out.println("===============================");

		Collections.sort(laps, new Laptop());

		for (Laptop temp : laps) {
			System.out.println(temp);
		}

	}
}
