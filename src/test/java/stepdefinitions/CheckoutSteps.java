package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.InventoryPage;
import pages.CartPage;
import pages.CheckoutPage;
import hooks.Hooks;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {

    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @Given("the user is on the SauceDemo login page")
    public void user_is_on_login_page() {
        loginPage = new LoginPage(driver);
    }

    @When("the user logs in with username {string} and password {string}")
    public void user_logs_in(String username, String password) {
        loginPage.login(username, password);
        inventoryPage = new InventoryPage(driver);
    }

    @When("the user adds the Backpack to the cart")
    public void user_adds_backpack_to_cart() {
        inventoryPage.addBackpackToCart();
    }

    @When("the user goes to the cart page")
    public void user_goes_to_cart_page() {
        inventoryPage.goToCart();
        cartPage = new CartPage(driver);
    }

    @When("the user clicks checkout")
    public void user_clicks_checkout() {
        cartPage.clickCheckout();
        checkoutPage = new CheckoutPage(driver);
    }

    @When("the user enters first name {string}, last name {string} and postal code {string}")
    public void user_enters_checkout_info(String firstName, String lastName, String postalCode) {
        checkoutPage.enterFirstName(firstName);
        checkoutPage.enterLastName(lastName);
        checkoutPage.enterPostalCode(postalCode);
    }

    @When("the user clicks continue")
    public void user_clicks_continue() {
        checkoutPage.clickContinue();
    }

    @When("the user clicks finish")
    public void user_clicks_finish() {
        checkoutPage.clickFinish();
    }
}
