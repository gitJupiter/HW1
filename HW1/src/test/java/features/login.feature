Feature: login
  Scenario: user should be able to login with valid data
    Given user at talenttek login page
    And user enter valid email address
    And user enter valid password
    When user click on login button
    Then user should be able to login successfully

  Scenario: user should not be able to login with invalid email
    Given user at talenttek login page
    And user enter invalid email address
    And user enter valid password
    When user click on login button
    Then user should not be able to login successfully

  Scenario: user should not be able to login with invalid password
    Given user at talenttek login page
    And user enter valid email address
    And user enter invalid password
    When user click on login button
    Then user should not be able to login successfully

  Scenario: user should not be able to login with invalid data
    Given user at talenttek login page
    And user enter invalid email address
    And user enter invalid password
    When user click on login button
    Then user should not be able to login successfully