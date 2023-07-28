@smoke
Feature: F01_Register | users could register new accounts with valid data

Scenario: guest user could register with valid data successfully
Given user go to register page
When user select gender type
And user enter first name "Mina" and last name "Morcos"
And user enter date of birth "7" "7" "1992"
And user enter email "test@example.com" field
And user fills Password fields "P@ssw0rd" "P@ssw0rd"
And user clicks on register button
Then verify success message is displayed