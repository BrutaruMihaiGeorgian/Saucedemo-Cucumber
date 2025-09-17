package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.InventoryPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogoutSteps {

    InventoryPage inventoryPage = new InventoryPage(Hooks.driver);

    @When("the user logs out")
    public void the_user_logs_out() {
        inventoryPage.logout();
    }

    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_login() {
        assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.saucedemo.com/"),
                "User was not redirected to login page after logout.");
    }
}
