package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.pageObjects.BuyingProductPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class FlipkartBuyingProduct extends TestBase{
	
	BuyingProductPage buyingProduct=new BuyingProductPage(driver);
	
	@And("^User clicked on the item and select buy now$")
	public void user_clicked_on_the_item_and_select_buy_no() throws Throwable {
		Thread.sleep(5000);
		buyingProduct.clickItemToBuy();
		Thread.sleep(5000);
		buyingProduct.switchTab();
		Thread.sleep(5000);
		buyingProduct.clickBuyNow();
		System.out.println("User clicked on the item and select buy now");
	}
	
	@And("^User selected the address and clicked deliver here$")
	public void user_selected_the_address_and_clicked_deliver_here() throws Throwable {
		Thread.sleep(5000);
		buyingProduct.clickdeliverHere();
		System.out.println("User selected the address and clicked deliver here");
	}
	
	@And("^User clicked on continue button$")
	public void user_clicked_on_continue_button() throws Throwable {
		buyingProduct.clickContinue();
		System.out.println("User clicked on continue button");
	}
	
//	@And("^User clicked on the item and select buy now$")
//	public void i_am_on_the_Login_page_URL(String arg1) throws Throwable {
//		System.out.println("User clicked on the item and select buy now");
//	}
}

