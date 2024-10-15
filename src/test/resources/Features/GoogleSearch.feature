Feature: Feature to test google search functionality

  Scenario: Validate google search is working
  
    Given Browser is open
    And user is on gooogle search page
    When User is on google search page
    And hit enter
    Then user is nevigated to searched result
