Feature: Make my trip use67kl   r Logged in and planned a trip

  Scenario: Login into the application with valid credentials and plan a trip
  	Given User is on the MakeMyTrip Login page URL "https://www.makemytrip.com/"
	Then Confirm one way is selected
	When User selected Kochi as departure location
	And User selected Chennai as arrival location 
	And User selected the date for travel
	And User selected the number of travellers
	And User clicked on the search button
	Then User verified the page is displayed or not
  	