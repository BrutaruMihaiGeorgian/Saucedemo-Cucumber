Feature: Login functionality

  # --- Scenariu login valid ---
  Scenario: Login cu user valid
    Given user is on the login page
    When user logs in with username "standard_user" and password "secret_sauce"
    Then user should be redirected to the inventory page

  # --- Scenariu login invalid ---
  Scenario: Login cu user invalid
    Given user is on the login page
    When user logs in with username "wrong_user" and password "wrong_pass"
    Then error message "Epic sadface: Username and password do not match any user in this service" should be displayed
