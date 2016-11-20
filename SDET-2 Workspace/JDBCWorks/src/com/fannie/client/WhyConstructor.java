package com.fannie.client;


class MyRoom{
	private int len;
	private int bre;
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getBre() {
		return bre;
	}
	public void setBre(int bre) {
		this.bre = bre;
	}
	
	MyRoom changeSizeMyRome(MyRoom myroom){
		MyRoom m = myroom;
		System.out.println("in method "+m.hashCode());
		m.setBre(myroom.getBre()+10);
		m.setLen(myroom.getLen()+10);
		
		return m;
	}
	
	
	
}


public class WhyConstructor {
	public static void main(String[] args) {
		MyRoom m = new MyRoom();
		System.out.println(m.hashCode());
		m.setBre(33);
		m.setLen(43);
		System.out.println(m.getBre() +", " + m.getLen());
		m.changeSizeMyRome(m);
		System.out.println("===========================");
		
		m.setBre(333);
		m.setLen(443);
		System.out.println(m.getBre() +", " + m.getLen());
		System.out.println(m.hashCode());
	}
}
