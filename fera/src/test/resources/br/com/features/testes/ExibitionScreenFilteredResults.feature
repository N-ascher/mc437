# encoding: UTF-8
Feature: Register on SADE
As an conpec member
I want to open the filter-dev page
So that I can properly choose a dev to a project

Scenario: Exibition of dev search results
Given the page is open "https://grupo-5-sade.herokuapp.com/#/"
When I select click "submit"
Then results must be on the screen