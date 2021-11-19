package com.cucumberFramework.stepdefinitions;

import java.util.ArrayList;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.AddingItemsToCartPage;
import com.cucumberFramework.pageObjects.FlipkartEndToEndTestPage;
import com.cucumberFramework.pageObjects.FlipkartLogInPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartEndToEndTest extends TestBase {

	FlipkartEndToEndTestPage flipkartEndToEndTest = new FlipkartEndToEndTestPage(driver);
	FlipkartLogInPage flipkartLogIn = new FlipkartLogInPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	@Then("^User should see the LogIn button$")
	public void user_should_see_the_LogIn_button() throws Throwable {
		flipkartEndToEndTest.clickLogInCloseButton();
		flipkartEndToEndTest.verifyLogInButton();

	}

	@And("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {

		waitHelper.WaitForElement(flipkartEndToEndTest.logInButton, 60);
		flipkartEndToEndTest.clickLogInButton();
	}

	@Then("^User should see the name as logged in$")
	public void user_should_see_the_name_as_logged_in() throws Throwable {
		flipkartEndToEndTest.verifyLoggedUser();
	}

	@And("^User selected that item$")
	public void user_selected_that_item() throws Throwable {

		waitHelper.WaitForElement(flipkartEndToEndTest.itemToAdd, 60);
		flipkartEndToEndTest.selectingItem();
	}

	@Then("^User verified the existance of place order button$")
	public void user_verified_the_existance_of_place_order_button() throws Throwable {

		flipkartEndToEndTest.verifyPlaceOrderButton();

	}

	@When("^User clicked on place order button$")
	public void user_clicked_on_place_order_button() throws Throwable {

		flipkartEndToEndTest.clickPlaceOrderButton();
	}

	@Then("^User should see the delivery address button$")
	public void user_should_see_the_delivery_address_button() throws Throwable {

		waitHelper.WaitForElement(flipkartEndToEndTest.deliverHereButton, 60);
		flipkartEndToEndTest.verifyDeliverHereButton();
	}

	@Then("^User added second item to Cart$")
	public void user_added_second_item_to_Cart() throws Throwable {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		waitHelper.WaitForElement(flipkartLogIn.addToCart, 60);
		flipkartLogIn.addToCart();
		Thread.sleep(3000);

		driver.switchTo().window(tabs.get(0));
		driver.navigate().refresh();
	}

}
