Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions

  Scenario: checking pre-condition, action and results
    Given user is on Home page
    When user clicks Log in button
    Then user is on login screen
  