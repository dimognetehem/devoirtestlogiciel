Feature: Account User Management

  Scenario: connection to the account with good credentials
    Given user in the homepage
    When user click avatar in navbar
    When user enters login
    And user enters password
    And user clicks on the connection button
    Then the connection is established and the test ends


  Scenario: connection to the account with bad credentials
    Given user to the homepage
    When user click avatar
    When bad login
    And bad password
    And user clicks the connection button
    Then error connection


