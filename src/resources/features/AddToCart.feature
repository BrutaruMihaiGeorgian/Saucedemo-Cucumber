Feature: Add product to cart

  Scenario: Add backpack to the cart
    Given the user is logged in with username "standard_user" and password "secret_sauce"
    When the user adds a backpack to the cart
    Then the cart should show 1 item
