Feature: PHP travel testing Examples with Data table

  Scenario Outline: checking the PHPTRAVEL login
    Given User is in the login page
    When Entering "<username>" and "<password>"
    And clicking the login button
    Then user successfully loggedin and loggout

    Examples: 
      | username            | password |
      | user@phptravels.com | demouser |