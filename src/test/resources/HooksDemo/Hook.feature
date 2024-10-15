Feature: validation of login

  Scenario: 
    Given user is Waiting on login page
    When enter correct name and pass
    And click on login button
    Then user is reached on home page

    Scenario: 
    Given user is Waiting on login page
    When enter correct name and pass
    And click on login button
    Then user is reached on home page
    				