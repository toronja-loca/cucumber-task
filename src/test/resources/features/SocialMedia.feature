Feature: check social media icons
  Scenario: user on main page
    Given user on the main page after register
    And  user scroll page down
    Then user see facebook icon
    Then user see linkedin icon
    Then user see twitter icon