Feature: multiple websites login testing

 ## Scenario: github login without username and password
 #   Given user is on github homepage
 #   When user clicks on Sign in button
 #   Then user is displayed github login screen
    
    
  #  Scenario: sdettraining login without username and password
  #  Given user is on sdettraining homepage
  #  When user clicks on Log in button
 #   Then user is displayed sdettraining login screen
 
 
 Scenario: New User Registration
    Given user is on Application landing page
    When user enters "Irfan" in username field
    And user enters "123456" in password field
    And user clicks on Signup for GitHub button
    Then user is successfully registered
    
    
    
      
    
    
    
    Scenario Outline: New User Registration
    Given user is on Application landing page
    When user enters "<User>" in username field
    And user enters "<Password>" in password field
    And user clicks on Signup for GitHub button
    Then user is successfully registered
    
    
     Examples:
      | User    | Password                                       |
      | Manager | hello1234     |
      | Admin   | hexaware!     |