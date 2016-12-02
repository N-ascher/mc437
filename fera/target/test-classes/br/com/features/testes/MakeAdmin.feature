Feature: Create a new CONPEC admin
  As a CONPEC admin
  I want to create a new admin user
  So that he can have admin privileges

  Scenario: results are shown
    Given a new page is open at sade "https://grupo-5-sade.herokuapp.com/#/"
    When i sign in and edit an existing user to be a admin
    Then a new admin should be registered at SADE
    
    
    