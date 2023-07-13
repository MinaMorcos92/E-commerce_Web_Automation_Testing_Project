@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could login with valid email and password
    Given user go to login page
    When user login with valid "tes@example.com" and valid "P@ssw0rd"
    And user click on login button
    Then verify login to the system successfully


  Scenario: user could login with invalid email and password
    Given user go to login page
    When user login with invalid "email@example.com" and "password"
    And user click on login button
    Then verify user couldn't login



