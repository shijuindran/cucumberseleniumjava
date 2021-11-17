Feature: Flipkart user should be able to logIn using valid credentials and should be able to add items to cart

  Scenario: Login into the application with valid credentials and adding items to cart and verifying both
  	Given User is on the Login page URL "https://www.flipkart.com"
  	Then User should see the LogIn button
    When User enter username as "9946694430"
    And User enter password as "mangobite@777"
    And User click on submit button
    Then User should see the name as logged in
	When User searched the item "airpods pro"
	And User added that item to Cart
	And User searched the item "tplink c20"
	And User selected that item
	And User added second item to Cart
	Then User verified whether that item is added to cart or not
	And User verified the existance of place order button
	When User clicked on place order button
	Then User should see the delivery address button