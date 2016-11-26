Feature: Manage active sessions
  As a registered user
  I want to manage existing sessions
  So that i can choose which ones can still stay logged in

  Scenario: results are shown
    Given the home page is open "https://grupo-5-sade.herokuapp.com/#/"
    When i sign in, acess the manage sessions page and delete an existing session
    Then that browser should not be logged in anymore after next access
    
    
    