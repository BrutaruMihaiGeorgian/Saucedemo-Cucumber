package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.InventoryPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(Hooks.driver);
    InventoryPage inventoryPage = new InventoryPage(Hooks.driver);

    // --- Step to navigate to the login page ---
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Hooks.driver.get("https://www.saucedemo.com/");
    }

    // --- Step for valid or invalid login ---
    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    // --- Step to verify redirect after a valid login ---
    @Then("user should be redirected to the inventory page")
    public void user_should_be_redirected_to_the_inventory_page() {
        String currentUrl = Hooks.driver.getCurrentUrl();
        Assertions.assertTrue(currentUrl.contains("inventory.html"),
                "User was not redirected to inventory page");
    }

    // --- Step to verify the error message after an invalid login ---
    @Then("error message {string} should be displayed")
    public void error_message_should_be_displayed(String expectedMessage) {
        String actualMessage = loginPage.getErrorMessage(); // trebuie să existe metoda în LoginPage
        Assertions.assertEquals(expectedMessage, actualMessage,
                "Error message does not match expected");
    }

    // --- New step: direct login as a precondition for scenarios ---
    @Given("the user is logged in with username {string} and password {string}")
    public void the_user_is_logged_in_with_username_and_password(String username, String password) {
        // Mergem pe pagina de login
        Hooks.driver.get("https://www.saucedemo.com/");
        // Facem login
        loginPage.login(username, password);
        // Verificăm că am ajuns pe pagina de inventar
        String currentUrl = Hooks.driver.getCurrentUrl();
        Assertions.assertTrue(currentUrl.contains("inventory.html"),
                "User was not redirected to inventory page");
    }
}
