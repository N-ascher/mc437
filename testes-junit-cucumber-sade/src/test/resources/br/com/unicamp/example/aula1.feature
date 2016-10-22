# encoding: UTF-8
Feature: Register on SADE
As an user  
I want to register on SADE
So that I am registered

  #  Scenario Tag ID is the test case id in TestRail,TestLink,ALM. multiple cases separated with blank space
  #  1. if the tag id is empty then it will create this scenario test case in your testRail,TestLink or ALM,
  #  2. but if you specified the scenario tag id as the test case id,then it will just update the existing test case .
  #  Scenario title is the Test Case name in TestRail,TestLink,ALM
  #  Step sentence is the 'cucumber' field value in TestRail,TestLink,ALM



Scenario: register form is shown
Given the page is open "conpec.com.br/sade/register.html"
When I click "Eu quero me cadastrar" 
Then a form page should open
     