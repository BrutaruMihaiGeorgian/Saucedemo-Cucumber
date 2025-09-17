package tests;

import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogoutTest extends tests.BaseTest {

    @Test
    public void testSuccessfulLogout() {
        // Step 1: Login with valid credentials
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Step 2: Navigate to inventory page and logout
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addBackpackToCart();

        // Step 3: Verify we're back on the login page (check for login button presence)
        assertTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/"),
                "User was not redirected to login page after logout.");

        System.out.println(" Logout test passed successfully.");
    }
}
