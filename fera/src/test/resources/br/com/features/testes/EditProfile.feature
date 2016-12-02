Feature: Edit a developer profile
  As a developer registered at SADE
  I want to edit my profile
  So that I can update my info

  Scenario: results are shown
    Given sade home is open at "https://grupo-5-sade.herokuapp.com/#/"
    When i sign in and edit my information
    Then the new information shows up at my profile
    
    
    