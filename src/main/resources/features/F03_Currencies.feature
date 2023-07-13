@smoke

Feature: F03_Currencies | Testing currency changing

  Scenario: verify user can select euro currency
    When user select euro currency
    Then euro symbol is displayed successfully on all four products