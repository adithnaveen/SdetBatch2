package com.fannie.hibernate02;

public class CellPhone extends Product {
	private String type; // ordinary or smart 
	private String os;   // iOS, Android, Windows
	private String connectivity;  // GSM, CDMA 
	
	
	public CellPhone(){}
	
	public CellPhone(String type, String os, String connectivity, 
			int pId, String pName, String pDesc, double pPrice) {
		super(pId, pName, pDesc, pPrice);
		this.type = type;
		this.os = os;
		this.connectivity = connectivity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getConnectivity() {
		return connectivity;
	}
	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}
	
	
	
}