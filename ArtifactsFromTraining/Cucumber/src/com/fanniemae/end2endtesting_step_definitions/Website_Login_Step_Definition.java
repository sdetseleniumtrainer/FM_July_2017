package com.fanniemae.end2endtesting_step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Website_Login_Step_Definition {
	
	WebDriver driver = null;
	String baseURL = "http://sdettraining.com/trguitransactions/default.aspx?id=new";
	
	@Given("^user is on Application landing page$")
	public void user_is_on_Application_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(baseURL);
	}

	@When("^user enters \"([^\"]*)\" in username field$")
	public void user_enters_in_username_field(String un) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("HeadLoginView_lblLoginStatus")).click();
		driver.findElement(By.id("MainContent_txtUserName")).clear();
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys(un + "@sdettraining.com");
	    System.out.println("UN is :" + un);
	}

	@When("^user enters \"([^\"]*)\" in password field$")
	public void user_enters_in_password_field(String pwd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("MainContent_txtPassword")).clear();
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys(pwd);
		
		System.out.println("UN is :" + pwd);
	}

	@When("^user clicks on Signup for GitHub button$")
	public void user_clicks_on_Signup_for_GitHub_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}

	@Then("^user is successfully registered$")
	public void user_is_successfully_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
