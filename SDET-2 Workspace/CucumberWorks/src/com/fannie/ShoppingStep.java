package com.fannie;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingStep {
	
	
	
	@Before("@Signup")
	public void beforeScenarioSingup(){
		System.out.println("^^^^^^ Before Scenario Executed for Signup^^^^^^");
	}
	
	@Before
	public void beforeScenario(){
		System.out.println("^^^^^^ Before Scenario Executed^^^^^^");
	}
	
	@After
	public void afterScenario(){
		System.out.println("^^^^ After Scenario Executed^^^^^");
	}
	
	
	@Given("Launch the browser")
	public void Launch_the_browser(){
		System.out.println("***** Launch the browser ****** ");
	}
	
	@Given("I start the application")
	public void I_start_the_application(){
		System.out.println("I start the application.... ");
	}
	
	@Then("^I should see a selection of product$")
	public void I_should_see_a_selection_of_product(){
		System.out.println("I should see a selection of product... ");
	}
	
	@When("^I browse \"([a-zA-Z]{1,})\" buying product$")
	public void I_browse_without_buying_product(String buyingOption){
		System.out.println("I browse "+buyingOption+" buying product.... ");
	}
	
	@Then("^My basket \"(.*)\" be empty$")
	public void My_basket_should_be_empty(String shouldOption){
		System.out.println("My basket "+shouldOption+" be empty... ");
	}
	
	@And("^I \"([a-zA-Z]{1,})\" buy an item$")
	public void I_Cannot_buy_an_item(String itemOption){
		System.out.println("I "+itemOption+" buy an item... ");
	}
	
	/*
	
	@When("I browse with buying product")
	public void I_browse_with_buying_product(){
		System.out.println("I browse with buying product >>>>>");
	}
	
	@Then("My basket shouldnot be empty")
	public void My_basket_shouldnot_be_empty(){
		System.out.println("My basket shouldnot be empty>>>>>>");
	}
	
	
	@And("I can buy an item")
	public void I_can_buy_an_item(){
		System.out.println("I can buy an item >>>>>");
	}
	
	
	*/
	
	
}
