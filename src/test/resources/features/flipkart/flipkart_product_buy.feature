Feature: Flipkart user logIn and buy one product

Scenario: LogIn into the application and buy one product
 	Given User am on the Login page URL "https://www.flipkart.com"
    Then User enter username as "9946694430"
    And User enter password as "mangobite@777"
    And User click on login button
	Then User searched the item "apple airpods pro"
	And User clicked on the item and select buy now
	And User selected the address and clicked deliver here
	And User clicked on continue button
