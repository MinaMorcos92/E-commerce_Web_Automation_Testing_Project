@smoke

Feature: F04_Search | user could search for products by product name and serial number

  Scenario Outline: user could search using product name
    When user search with valid product name "<product name>"
    Then verify user find relative results "<product name>"
    Examples:
      |product name|
      | apple |
      | laptop|
      | nike |


 Scenario Outline: user could search using serial number

   When user search with valid "<serial number>"
   And click on the product from search reslt
    Then verify user find the exact serial "<serial number>"
   Examples:
     | serial number |
     | SCI_FAITH |
     | APPLE_CAM|
     | SF_PRO_11 |