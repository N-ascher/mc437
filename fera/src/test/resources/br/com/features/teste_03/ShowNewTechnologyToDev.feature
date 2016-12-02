Feature: Select new technology on the developer register form
  As a developer
  I want to select new technology subjects on my profile
  So I can rate my knowledge in them

  Scenario: results are shown
    Given the homepagepage is open "https://grupo-5-sade.herokuapp.com/cadastro_desenvolvedor/"
    When i navigate to the Tecnologias dialogue box and click it 
    Then the new technology subject should appear