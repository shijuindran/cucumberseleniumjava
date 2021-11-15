package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.AddingItemsToCartPage;
import com.cucumberFramework.pageObjects.LoginLogoutPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddingItemsToCartStepDefinitions extends TestBase{
	
	AddingItemsToCartPage addingItemsToCartPage = new AddingItemsToCartPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^I am on the Login page URL shiju \"([^\"]*)\"$")
	public void i_am_on_the_Login_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
		//waitHelper = new WaitHelper(driver);
		System.out.println("i_am_on_the_Login_page_URL() executed!!!!!!!");
	}

	@Then("^I click on sign in button and wait for sign in page Shiju$")
	public void i_click_on_sign_in_button_and_wait_for_sign_in_page() throws Throwable {
		addingItemsToCartPage.clickSignInButton();
		waitHelper.WaitForElement(addingItemsToCartPage.userName, 60);
	}

	@Then("^I should see Sign In Page Shiju$")
	public void i_should_see_Sign_In_Page() throws Throwable {
		addingItemsToCartPage.userName.isDisplayed();
	}

	@When("^I enter username as \"([^\"]*)\" Shiju$")
	public void i_enter_username_as(String arg1) throws Throwable {
		addingItemsToCartPage.enterUserName(arg1);
	}

	@When("^I Click on Continue button Shiju$")
	public void i_Click_on_Continue_button() throws Throwable {
		addingItemsToCartPage.clickContinueButton();
		waitHelper.WaitForElement(addingItemsToCartPage.password, 60);
	}

	@When("^I enter password as \"([^\"]*)\" Shiju$")
	public void i_enter_password_as(String arg1) throws Throwable {
		addingItemsToCartPage.enterPassword(arg1);
	}

	@When("^click on login button Shiju$")
	public void click_on_login_button() throws Throwable {
		addingItemsToCartPage.clickLoginButton();
	}
	
	@When("^I am logged in Shiju$")
	public void i_am_already_logged_in() throws Throwable {
		System.out.println("i_am_already_logged_in()");
		//addingItemsToCartPage.logoutBtn.isDisplayed();
	}
	
}
