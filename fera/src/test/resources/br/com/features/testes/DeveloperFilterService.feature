# encoding: UTF-8
Feature: Developer filter service
As an Conpec member  
I want to filter developers by their attributes
So that i can choose based on the best fit for the project

  #  Scenario Tag ID is the test case id in TestRail,TestLink,ALM. multiple cases separated with blank space
  #  1. if the tag id is empty then it will create this scenario test case in your testRail,TestLink or ALM,
  #  2. but if you specified the scenario tag id as the test case id,then it will just update the existing test case .
  #  Scenario title is the Test Case name in TestRail,TestLink,ALM
  #  Step sentence is the 'cucumber' field value in TestRail,TestLink,ALM


Scenario: Developer filter service
  Given I already signed in as a Conpec member.
  When I set the prefered filtering parameters and press Filter
  Then I should have a list of potential candidates that passed the set filters