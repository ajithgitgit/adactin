Feature: Adactin Hotel Application Login
  As a registered user
  I want to login to the Adactin Hotel application
  So that I can access the hotel booking features

  @ValidLogin
  Scenario: Login with valid credentials
    When the user enters a valid username
    And the user enters a valid password
    And the user clicks the Login button
    Then the user should be successfully logged in
