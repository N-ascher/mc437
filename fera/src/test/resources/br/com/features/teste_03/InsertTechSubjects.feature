Feature: Insert technology subjects into SADE
  As a CONPEC admin
  I want to create a new technology subject
  So a developer can rate his knowledge in it

  Scenario: results are shown
    Given the homepagepage is open "https://grupo-5-sade.herokuapp.com/gerenciamento_tecnologias/"
    When i navigate to the create new technology subject dialogue and i fill in all the necessary information
    Then a new technology subject should be created