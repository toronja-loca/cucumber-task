Feature: choice feature
  Scenario: user choice item and return to main page
    Given user on the main page after successfull register
    And user choice backpack on the main page
    And user add backpack to  bucket
    Then user return to main page
    Then user see number of items in the basket is one