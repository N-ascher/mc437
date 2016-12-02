Feature: Deny acess to unauthorized users
  As an user
  I want to acess an out of bounds page
  So that he can have access to sensible informations

  Scenario: results are shown
    Given the home page is open "https://grupo-5-sade.herokuapp.com/#/"
    When i sign in and and navigate to "https://grupo-5-sade.herokuapp.com/#/user-management"
    Then an error should be shown
    
    
    