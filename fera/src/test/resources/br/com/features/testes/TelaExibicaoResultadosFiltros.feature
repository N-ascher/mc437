# encoding: UTF-8
Feature: Register on SADE
As an conpec member
I want to open the filter-dev page
So that I can properly choose a dev to a project

  #  Scenario Tag ID is the test case id in TestRail,TestLink,ALM. multiple cases separated with blank space
  #  1. if the tag id is empty then it will create this scenario test case in your testRail,TestLink or ALM,
  #  2. but if you specified the scenario tag id as the test case id,then it will just update the existing test case .
  #  Scenario title is the Test Case name in TestRail,TestLink,ALM
  #  Step sentence is the 'cucumber' field value in TestRail,TestLink,ALM



Scenario: Exibition of dev search results
Given the page is open "conpec.com.br/sade/busca_devs.php"
When I select click "submit"
Then results must be on the screen