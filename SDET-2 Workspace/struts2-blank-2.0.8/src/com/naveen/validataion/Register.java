package com.naveen.validataion;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	public void validate() {

		if (personBean.getFirstName().length() == 0) {
			addFieldError("personBean.firstName", "First name is required.");
		}
		if(personBean.getLastName().length() ==0){
			addFieldError("personBean.lastName", "Last name is reuqired");
		}

		if (personBean.getEmail().length() == 0) {
			addFieldError("personBean.email", "Email is required.");
		}

		if (personBean.getAge() < 18) {
			addFieldError("personBean.age",
					"Age is required and must be 18 or older");
		}
	}

	@Override
	public String execute() throws Exception {

		// call Service class to store personBean's state in database

		if("hi".equals("hi")){
			
		throw new Exception("Some  Exception thrown... ");
		}
		

		
		return SUCCESS;

	}

	public Person getPersonBean() {

		return personBean;

	}

	public void setPersonBean(Person person) {

		personBean = person;

	}

}