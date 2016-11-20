package com.fannie;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingStep {

	@Given("I start the application")
	public void I_start_the_application(DataTable data){
		
		List<Map<String, String>> list =   data.asMaps(String.class, String.class);
		
		System.out.println("application is " + list.get(0).get("Application_Name"));
		System.out.println("application is " + list.get(1).get("Application_Name"));
		System.out.println("application is " + list.get(2).get("Application_Name"));
		
		System.out.println("I start the application.... ");
	}
	
	@Then("^I should see a selection of product$")
	public void I_should_see_a_selection_of_product(DataTable data){
		
		List<Map<String, String>> list = data.asMaps(String.class, String.class);
		
		for(int i=0; i<list.size(); i++ ){
		System.out.print ("Product Name " + list.get(i).get("Product_Name"));
		System.out.println("Product Category " + list.get(i).get("Product_Category"));
		}
		
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
