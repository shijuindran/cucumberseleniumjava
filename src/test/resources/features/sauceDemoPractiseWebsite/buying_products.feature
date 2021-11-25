Feature: User logged in using valid credentials and bought some products

  Scenario: Login into the application with valid credentials and bought some products
  	Given User is on the SauceDemo Login page URL "https://www.saucedemo.com/"
  	Then User should see the LogIn page
    When User enters username as "standard_user"
    And User enters password as "secret_sauce"
    And User clicked on the Login button
    Then User should logged in
    When User sorted the items according to price low to high
   And User added some items to cart
   And User verified items on cart
   Then User verified checkout button in cart page
   And User clicked checkout button
   Then User verified continue button is displayed or not
   When User clicked continue button
   And User enter first name as "Virtusa" and last name as "Banglore" and zip code as "112255"
   And User clicked on the continue button
   Then User verified the finish button is displayed or not
   When User clicked on the finish button
   Then Order confirmation is displayed