Feature: Register at SADE as a developer
  As a developer
  I want to register at Sade
  So that I can get a job

  Scenario: results are shown
    Given the page is open "https://grupo-5-sade.herokuapp.com/#/register"
    When i fill all the necessary information
    Then my registration should be complete
    
    
    