# encoding: UTF-8
Feature: Register on SADE
As a developer who already registered
I want to edit my informations
So that I can properly be chosen to a project




Scenario: Dev info atualization by him/herself
Given the page1 is open "conpec.com.br/sade/devs/id_dev/edit.php"
When I select click "submit"
Then It must lead me to the atualizated "conpec.com.br/sade/devs/id_dev.php"