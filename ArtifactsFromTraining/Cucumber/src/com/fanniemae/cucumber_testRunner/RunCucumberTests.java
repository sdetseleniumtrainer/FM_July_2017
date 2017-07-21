package com.fanniemae.cucumber_testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/com/fanniemae/smoketesting_features", "src/com/fanniemae/regressiontesting_features"},
		glue = {"com.fanniemae.smoketesting_step_definitions","com.fanniemae.regressiontesting_step_definitions"},
		plugin = { 
					"pretty",
					"html:target/cucumber-reports",
					"json:target_json/Cucumber.json",
	    	         "junit:target_junit/Cucumber_junit.xml"
				} 
		
		)
public class RunCucumberTests {

}
