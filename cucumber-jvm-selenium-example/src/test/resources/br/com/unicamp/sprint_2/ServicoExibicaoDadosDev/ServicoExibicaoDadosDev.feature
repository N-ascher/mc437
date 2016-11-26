# encoding: UTF-8
Feature: Register on SADE
As a conpec member
I want to open the filter-dev page
So that I can properly choose a dev to a project




Scenario: Exibition service  of dev search results
Given the page is open "conpec.com.br/sade/busca_devs.php"
When I select click "submit"
Then The service must lead me to a result page