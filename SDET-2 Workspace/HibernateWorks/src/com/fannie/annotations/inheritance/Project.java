package com.fannie.annotations.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Project {
	
	@Id
	private int prjId;
	
	@Column(name="ProjectName")
	private String prjName;
	
	public int getPrjId() {
		return prjId;
	}
	public void setPrjId(int prjId) {
		this.prjId = prjId;
	}
	public String getPrjName() {
		return prjName;
	}
	public void setPrjName(String prjName) {
		this.prjName = prjName;
	}
	
	
}
