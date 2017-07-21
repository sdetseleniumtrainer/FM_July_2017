package com.fanniemae.regressiontesting_step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/com/fanniemae/regressiontesting_features",
		glue = "com.fanniemae.regressiontesting_step_definitions",
		plugin = { 
					"pretty",
					"html:target/cucumber-reports",
				} 
		
		)
public class RunCucumberTests {

}
