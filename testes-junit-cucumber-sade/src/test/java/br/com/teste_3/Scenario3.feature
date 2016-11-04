# encoding: UTF-8
Feature: Developer query at SADE
As an Conpec member  
I want to query developers ranked by a standard
So that i can choose based on best experience

  #  Scenario Tag ID is the test case id in TestRail,TestLink,ALM. multiple cases separated with blank space
  #  1. if the tag id is empty then it will create this scenario test case in your testRail,TestLink or ALM,
  #  2. but if you specified the scenario tag id as the test case id,then it will just update the existing test case .
  #  Scenario title is the Test Case name in TestRail,TestLink,ALM
  #  Step sentence is the 'cucumber' field value in TestRail,TestLink,ALM



Scenario: Developer query at SADE
  Given I already signed in as a Conpec member.
  When I set the query prefered ranking parameters and press Buscar
  Then I should have a list of potential candidates ranked by the set parameters.
