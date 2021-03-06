package com.fannie.annotations;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="CustomerMaster")
@SecondaryTable(name="CustomerDetails")
public class Customer {
	
	@Id
	@GeneratedValue
	private int custId;
	
	@Column(nullable=false)
	private String custName;
	
	@Column(table="CustomerDetails")
	private double custSal;
	
	@Column(table="CustomerDetails")
	private String custEmail;
	
	@Transient
	private String password;
	
	@Temporal(TemporalType.DATE)
	private Calendar dob;
	
	

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getCustSal() {
		return custSal;
	}

	public void setCustSal(double custSal) {
		this.custSal = custSal;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getDob() {
		return dob;
	}

	public void setDob(Calendar dob) {
		this.dob = dob;
	}
}
