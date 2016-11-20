package com.fannie;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep {

	@Given("^Launch the application$")
	public void launch_the_application() throws Throwable {
		System.out.println("Launch the application-----");
	}

	@Then("^Enter valid username and password$")
	public void enter_valid_username_and_password() throws Throwable {
		System.out.println("Enter valid username and password ----- ");
	}

	@And("^Click on submit button$")
	public void click_on_submit_button() throws Throwable {
		System.out.println("Click on submit button -----");
	}

	@Then("^Take me to home page$")
	public void take_me_to_home_page() throws Throwable {
		System.out.println("Take me to home page -----");
	}
}
