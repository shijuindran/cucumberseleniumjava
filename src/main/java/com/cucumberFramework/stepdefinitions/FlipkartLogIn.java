package com.cucumberFramework.stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.FlipkartLogInPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class FlipkartLogIn extends TestBase {
	
	FlipkartLogInPage flipkartLogIn = new FlipkartLogInPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	    @Given("^User is on the Login page URL \"([^\"]*)\"$")
	    public void user_am_on_the_login_page_url_something(String strArg) throws Throwable {
	        driver.get(strArg);

	        waitHelper.WaitForElement(flipkartLogIn.logIn, 60);
	        
	    }
	    
	    @When("^User click on LogIn button and wait$")
	    public void user_click_on_login_button_and_wait() throws Throwable {
	        flipkartLogIn.clickLoginButtonFlipkart();
	        waitHelper.WaitForElement(flipkartLogIn.userName, 60);
	    }
	    
	    @Then("^User enter username as \"([^\"]*)\"$")
	    public void user_enter_username_as(String strArg1) throws Throwable {
	    	driver.findElement(By.xpath("//a[text()='Login']")).click();
	    	flipkartLogIn.enterUserNameFlipkart(strArg1);
	    	waitHelper.WaitForElement(flipkartLogIn.password, 60);
	    }
	    
	    @And("^User enter password as \"([^\"]*)\"$")
	    public void user_enter_password_as_something(String strArg1) throws Throwable {
	        flipkartLogIn.enterPasswordFlipkart(strArg1);
	    }

	    @And("^User click on submit button$")
	    public void user_click_on_submit_button() throws Throwable {
	        flipkartLogIn.clickSubmitButtonFlipkart();
	        Thread.sleep(4000);
	    }
	    @When("^User searched the item \"([^\"]*)\"$")
	    public void user_searched_the_item(String arg1) throws Throwable {
	    	Thread.sleep(5000);
	    	flipkartLogIn.searchingItemsFlipkart(arg1);
	    	
	    }

	    @Then("^User added that item to Cart$")
	    public void user_added_that_item_to_Cart() throws Throwable {
	    	Thread.sleep(5000);
	    	flipkartLogIn.addApplAirPodToTheCart();
	    	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    flipkartLogIn.addToCart();
		    
		    Thread.sleep(5000);
		    driver.switchTo().window(tabs.get(0));
		    driver.navigate().refresh();
	    }

	    @Then("^User verified whether that item is added to cart or not$")
	    public void user_verified_whether_that_item_is_added_to_cart_or_not() throws Throwable {
	   
	    	 flipkartLogIn.cartVerification("2");
	    	
	    	Thread.sleep(10000);
	    }

	    @Then("^User removed that item from cart$")
	    public void user_removed_that_item_from_cart() throws Throwable {
	    	Thread.sleep(5000);
	    	flipkartLogIn.removingCartItem();
	    	Thread.sleep(5000);
	    	driver.navigate().back();
	    	Thread.sleep(5000);
	    }

	    @Then("^User logged out$")
	    public void user_logged_out() throws Throwable {
	    	
	    	flipkartLogIn.logOut();
	     
	    }


	}

