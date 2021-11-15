Feature: Flipkart user logIn using valid credentials

  Scenario: Login into the application with valid credentials
  	Given User am on the Login page URL "https://www.flipkart.com"
    Then User enter username as "9946694430"
    And User enter password as "mangobite@777"
    And User click on login button
	Then User searched the item "airpods pro"
	And User added that item to Cart
	Then User verified whther that item is added to cart or not
	And User removed that item from cart
	And User logged out