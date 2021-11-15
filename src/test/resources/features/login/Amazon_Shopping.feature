@regression @local_testing
Feature: As an Amazon user I should be able to login and logout with valid credentials

  Scenario: Login into the application with valid credentials
  	Given I am on the Login page URL shiju "https://www.amazon.in/"
    Then I click on sign in button and wait for sign in page Shiju
    Then I should see Sign In Page Shiju
    When I enter username as "9946694430" Shiju
    And I Click on Continue button
    And I enter password as "mangobite@777"
    And click on login button Shiju
    Then I am logged in Shiju