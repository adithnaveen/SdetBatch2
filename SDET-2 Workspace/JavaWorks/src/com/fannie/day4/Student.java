package com.fannie.day4;

import java.io.Serializable;

public class Student implements Serializable {
	private int sId;
	private String sName;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}
	public Student(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	
	public Student(){}
}
