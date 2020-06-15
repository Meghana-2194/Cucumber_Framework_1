package com.qa.stepDefinition;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends TestBase {

    LoginPage loginPage = new LoginPage();
    HomePage homePage ;
    
    
	@When("^user opens browser$")
	public void user_opens_browser() {
		// initialize the testbase class
		TestBase.initialization();

	}

	@Then("^opens url$")
	public void opens_url() {
		String title = loginPage.validateTitle();
		System.out.println("The title is : " +title);
	
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() {

	}

	@Then("^enters username and password and login$")
	public void enters_username_and_password() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

}
