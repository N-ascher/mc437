Feature: Show Developer Data Screen
  As a CONPEC Admin
  I want to see the developers's data
  So that I can choose the best one for a project

  Scenario: results are shown
    Given the page is open "https://grupo-5-sade.herokuapp.com/#/dados_desenvolvedores"
    When i click to see all data
    Then the developer data page should be shown