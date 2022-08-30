Feature: Login feature
  @smoke
  Scenario: Valid admin login

    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in

