package tests;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest extends tests.BaseTest {

    @Test
    public void testSuccessfulCheckout() {
        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Add product to cart
        InventoryPage inventoryPage = new InventoryPage(driver);
       // inventoryPage.addBackpackToCart();
        inventoryPage.goToCart();

        // Click checkout from cart page
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();

        // Fill in checkout form
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterFirstName("John");
        checkoutPage.enterLastName("Doe");
        checkoutPage.enterPostalCode("12345");
        checkoutPage.clickContinue();

        // Verify checkout overview (case-insensitive)
        assertTrue(
                checkoutPage.getCheckoutOverviewTitle().equalsIgnoreCase("Checkout: Overview"),
                "The overview page title does not match (case-insensitive)."
        );

// Finish the order
        checkoutPage.clickFinish();

// Confirm success message
        assertEquals("Thank you for your order!", checkoutPage.getThankYouMessage());

// Log success
        System.out.println(" Checkout test passed successfully.");

    }
}