Feature: Logout

  Scenario: Successful logout
    Given the user is logged in with username "standard_user" and password "secret_sauce"
    When the user logs out
    Then the user should be redirected to the login page
