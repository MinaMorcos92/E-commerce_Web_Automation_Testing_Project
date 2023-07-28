@smoke

Feature: F05_HoverCategories| user could be able to hover on categories to select subcategories
  Scenario: user could be able to hover on categories to select subcategories
    When select one of the seven main categories to hover randomly
    And select one of the three subcategories to hover randomly if it have
    Then the page title should be the same as the selected one