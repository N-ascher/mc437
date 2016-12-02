Feature: Only accept safe usernames at the signup
  As a malicious user
  I want to create a malicious username
  So that he can have admin privileges without permission

  Scenario: results are shown
    Given the homepage is open in "https://grupo-5-sade.herokuapp.com/#/register"
    When sign up with a malicious username " ) DROP TABLE * "
    Then the username should not be accepted
    
    
    