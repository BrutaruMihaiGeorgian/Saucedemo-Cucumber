Feature: Remove product from cart

  Scenario: Remove backpack from the cart
    Given the user is logged in with username "standard_user" and password "secret_sauce"
    And the user has added a backpack to the cart
    When the user removes the backpack from the cart
    Then the cart should not contain "Sauce Labs Backpack"
