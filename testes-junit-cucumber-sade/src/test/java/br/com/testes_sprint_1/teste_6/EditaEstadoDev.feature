# encoding: UTF-8
Feature: Developer Rating
  As a Conpec member
  I want to give the developer a rating
  So I can know who are the best developers


  #  Scenario Tag ID is the test case id in TestRail,TestLink,ALM. multiple cases separated with blank space
  #  1. if the tag id is empty then it will create this scenario test case in your testRail,TestLink or ALM,
  #  2. but if you specified the scenario tag id as the test case id,then it will just update the existing test case .
  #  Scenario title is the Test Case name in TestRail,TestLink,ALM
  #  Step sentence is the 'cucumber' field value in TestRail,TestLink,ALM



  Scenario: Allocating a developer to a project
    Given the user is signed in and the page that edits the developer's profile is open
    When select the appropriate project and click on the Allocate button
    Then the developer should now appear as allocated

