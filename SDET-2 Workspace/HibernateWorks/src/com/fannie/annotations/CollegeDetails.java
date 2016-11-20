package com.fannie.annotations;

import javax.persistence.Embeddable;

@Embeddable
public class CollegeDetails {
	private int collegeStrength;
	private String collegeLocation; 
	private String collegeContact;
	public int getCollegeStrength() {
		return collegeStrength;
	}
	public void setCollegeStrength(int collegeStrength) {
		this.collegeStrength = collegeStrength;
	}
	public String getCollegeLocation() {
		return collegeLocation;
	}
	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}
	public String getCollegeContact() {
		return collegeContact;
	}
	public void setCollegeContact(String collegeContact) {
		this.collegeContact = collegeContact;
	}
	
	
	
}