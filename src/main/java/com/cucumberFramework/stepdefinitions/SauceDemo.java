package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.SauceDemoPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceDemo extends TestBase {

	SauceDemoPage sauceDemo = new SauceDemoPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	@Given("^User is on the SauceDemo Login page URL \"([^\"]*)\"$")
	public void user_am_on_the_saucedemo_login_page_url_something(String strArg) throws Throwable {
		driver.get(strArg);
	}

	@Then("^User should see the LogIn page$")
	public void user_should_see_the_LogIn_page() throws Throwable {
		waitHelper.WaitForElement(sauceDemo.logInButton, 20);

		sauceDemo.verifyLogInPage();
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String strArg1) throws Throwable {
		sauceDemo.enterUsername(strArg1);

	}

	@And("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as_something(String strArg1) throws Throwable {

		sauceDemo.enterPassword(strArg1);
	}

	@When("^User clicked on the Login button$")
	public void user_clicked_on_the_Login_button() throws Throwable {
		sauceDemo.logInButton.click();
	}

	@Then("^User should logged in$")
	public void user_should_logged_in() throws Throwable {

		waitHelper.WaitForElement(sauceDemo.cartIcon, 20);
		sauceDemo.verifyUserLoggedIn();
	}

	@When("^User sorted the items according to price low to high$")
	public void user_sorted_the_items_according_to_price_low_to_high() throws Throwable {

		sauceDemo.sortingItems();
	}

	@When("^User added some items to cart$")
	public void user_added_some_items_to_cart() throws Throwable {

		sauceDemo.addingItemsToCart();

	}

	@When("^User verified items on cart$")
	public void user_verified_items_on_cart() throws Throwable {

		sauceDemo.verifyCartItems();

	}

	@Then("^User verified checkout button in cart page$")
	public void user_verified_checkout_button_in_cart_page() throws Throwable {

		sauceDemo.verifyCheckOutButton();
	}

	@Then("^User clicked checkout button$")
	public void user_clicked_checkout_button() throws Throwable {

		sauceDemo.clickCheckoutButton();

	}

	@Then("^User verified continue button is displayed or not$")
	public void user_verified_continue_button_is_displayed_or_not() throws Throwable {

		sauceDemo.verifyContinueButton();

	}

	@When("^User clicked continue button$")
	public void user_clicked_continue_button() throws Throwable {

		sauceDemo.clickContinueButton();

	}

	@And("^User enter first name as \"([^\"]*)\" and last name as \"([^\"]*)\" and zip code as \"([^\"]*)\"$")
	public void user_enter_first_name_as_and_last_name_as_and_zip_code_as(String arg1, String arg2, String arg3)
			throws Throwable {

		sauceDemo.addingAddress(arg1, arg2, arg3);

	}

	@When("^User clicked on the continue button$")
	public void user_clicked_on_the_continue_button() throws Throwable {

		sauceDemo.clickContinueButton();

	}

	@Then("^User verified the finish button is displayed or not$")
	public void user_verified_the_finish_button_is_displayed_or_not() throws Throwable {
		sauceDemo.verifyFinishButton();
	}

	@When("^User clicked on the finish button$")
	public void user_clicked_on_the_finish_button() throws Throwable {
		sauceDemo.clickFinishButton();
	}

	@Then("^Order confirmation is displayed$")
	public void order_confirmation_is_displayed() throws Throwable {

	}

}
