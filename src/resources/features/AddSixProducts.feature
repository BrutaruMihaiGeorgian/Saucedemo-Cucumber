Feature: Add multiple products to cart
  As a standard user
  I want to add all 6 products to the cart
  So that I can see them in my cart badge

  Scenario: Add all six products to the cart
    Given the user is logged in with username "standard_user" and password "secret_sauce"
    When the user adds all six products to the cart
    Then the cart should show 6 items
