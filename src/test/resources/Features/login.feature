Feature: Feature to test Login functionality

  Scenario Outline: : Check login is successful with vailid credential
    Given user is on login page
    When User enters vailid <username> and <password>
    And click on login button
    Then user is nevigated on home page

    Examples: 
      | username | password |
      | admin    | admin    |
