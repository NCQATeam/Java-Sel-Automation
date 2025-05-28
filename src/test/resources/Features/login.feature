Feature: Login page Automation of Saucedemo App

  Scenario Outline: Check login is successful with valid creds
    Given User is on login page
    When User enters valid "<username>" and "<Password>"
    And Clicks on Login Button
    Then User is navigated to Home Page
    And Close the browser

    Examples: 
      | username      | Password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
