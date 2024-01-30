Feature: Login feature

  Scenario: Login Success
    Given I open Login page
    When I enter email "azahn007@gmail.com"
    And I enter password "Koelpass"
    And I submit
    Then I am logged in

