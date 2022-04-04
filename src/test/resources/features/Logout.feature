Feature: successful register and logout user
  Scenario: successful register and logout
    Given User successful register
    Then User click navbar button
    And User log out