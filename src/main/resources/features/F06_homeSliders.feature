@smoke

Feature: F06_homeSliders | testing home sliders functionality
  Scenario: user hoover to iphone14 slider and click on it
    When user click on iphone14 slider
    Then verify URL will change from home to iphone14


  Scenario: user hoover to Galaxy S22 Ultra slider and click on it
    When user click on Galaxy slider
    Then verify URL will change from home to Galaxy