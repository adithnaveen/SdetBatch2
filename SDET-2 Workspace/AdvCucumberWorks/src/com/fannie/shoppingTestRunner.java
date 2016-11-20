package com.fannie;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
	monochrome= false, 
	features ="src/com/fannie", 
	plugin={"pretty", "html:target/cucumber-html-report"}, 
	tags = {"@Smoke,@Sanity"}
)

public class shoppingTestRunner{ // extends AbstractTestNGCucumberTests{

}
