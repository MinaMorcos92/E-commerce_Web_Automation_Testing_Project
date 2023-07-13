@smoke

Feature: F08_WishList | users could add products to the wishlist
  Scenario: user add product to wishlist
    When user add product
    Then success message is displayed


    Scenario: user add product and go to wishlist to make sure it's added successfully
      When user add product and go to wishlist
      Then is quantity more than zero