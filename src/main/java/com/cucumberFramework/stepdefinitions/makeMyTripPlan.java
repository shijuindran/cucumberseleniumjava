package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.LoginLogoutPage;
import com.cucumberFramework.pageObjects.makeMyTripPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class makeMyTripPlan extends TestBase {
	
	makeMyTripPage makeMyTrip = new makeMyTripPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	
    @Given("^User is on the MakeMyTrip Login page URL \"([^\"]*)\"$")
    public void user_is_on_the_makemytrip_login_page_url_something(String strArg) throws Throwable {
        driver.get(strArg);
        
        
    }
	
	@Then("^Confirm one way is selected$")
	public void confirm_one_way_is_selected() throws Throwable {
		waitHelper.WaitForElement(makeMyTrip.oneWay, 20);
		makeMyTrip.verifyOneWayIsSelected();
		
	}

	@When("^User selected Kochi as departure location$")
	public void user_selected_kochi_as_departure_location() throws Throwable {
	makeMyTrip.actionsClick();
	waitHelper.WaitForElement(makeMyTrip.departure, 20);
	 makeMyTrip.departureCity();
	}

	@When("^User selected Chennai as arrival location$")
	public void user_selected_Chennai_as_arrival_location() throws Throwable {
	 
		 makeMyTrip.ArrivalCity();
	}

	@When("^User selected the date for travel$")
	public void user_selected_the_date_for_travel() throws Throwable {
		
		
		 makeMyTrip.selectingDate();

	}

	@When("^User selected the number of travellers$")
	public void user_selected_the_number_of_travellers() throws Throwable {
	   
		makeMyTrip.addPassengers();
	}

	@When("^User clicked on the search button$")
	public void user_clicked_on_the_search_button() throws Throwable {
	  
		makeMyTrip.clickSearchButton();
	}

	@Then("^User verified the page is displayed or not$")
	public void user_verified_the_page_is_displayed_or_not() throws Throwable {
		makeMyTrip.verifySearchPageisDisplayed();
	}

}
