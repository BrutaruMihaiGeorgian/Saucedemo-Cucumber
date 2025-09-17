Feature: Checkout

  Scenario: Successful checkout with one product
    Given the user is on the SauceDemo login page
    When the user logs in with username "standard_user" and password "secret_sauce"
    And the user adds the Backpack to the cart
    And the user goes to the cart page
    And the user clicks checkout
    And the user enters first name "John", last name "Doe" and postal code "12345"
    And the user clicks continue
    When the user clicks finish
