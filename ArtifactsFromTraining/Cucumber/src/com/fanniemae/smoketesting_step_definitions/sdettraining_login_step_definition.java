package com.fanniemae.smoketesting_step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sdettraining_login_step_definition {
	
	@Given("^user is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Code to navigate will come here");
	}

	@When("^user clicks Log in button$")
	public void user_clicks_Log_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Code to user_clicks_Log_in_button will come here");
	}

	@Then("^user is on login screen$")
	public void user_is_on_login_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Code to assert user is on login screen will come here");
	}


}
