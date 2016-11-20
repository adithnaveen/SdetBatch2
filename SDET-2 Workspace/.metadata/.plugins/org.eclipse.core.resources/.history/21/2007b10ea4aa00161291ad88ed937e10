package com.fannie.annotations;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class College {
	private int collegeId;
	private String collegeName;
	
	@Embedded
	private CollegeDetails collegeDetails;
	
	@Id
	@GeneratedValue
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public CollegeDetails getCollegeDetails() {
		return collegeDetails;
	}
	public void setCollegeDetails(CollegeDetails collegeDetails) {
		this.collegeDetails = collegeDetails;
	}
	
}
