# encoding: UTF-8
Feature: Allert after dev registration
After dev registers, Compec must be allerted by email


  #  Scenario Tag ID is the test case id in TestRail,TestLink,ALM. multiple cases separated with blank space
  #  1. if the tag id is empty then it will create this scenario test case in your testRail,TestLink or ALM,
  #  2. but if you specified the scenario tag id as the test case id,then it will just update the existing test case .
  #  Scenario title is the Test Case name in TestRail,TestLink,ALM
  #  Step sentence is the 'cucumber' field value in TestRail,TestLink,ALM



Scenario: Developer finishes registration process
  Given the registration page is open
  When Dev clicks on “Register” and the form properly filled
  Then an email should be automatically sent to Conpec
