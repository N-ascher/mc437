Feature: Retrieve a lost password
  As a user that is already registered at SADE
  I want to retrieve the password to my account
  So that i can access SADE again

  Scenario: results are shown
    Given the home page is open "https://grupo-5-sade.herokuapp.com/#/"
    When i try to retrieve my password
    Then an email with instructions should be sent to me
    
    
    