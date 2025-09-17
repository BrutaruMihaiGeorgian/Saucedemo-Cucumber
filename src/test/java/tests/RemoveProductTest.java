package tests;

import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class RemoveProductTest extends tests.BaseTest {

    @Test
    public void testRemoveBackpackFromCart() {
        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Add backpack to cart
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addBackpackToCart();

        // Go to cart page
        inventoryPage.goToCart();

        // Create CartPage object
        CartPage cartPage = new CartPage(driver);

        // Remove backpack from cart
        cartPage.removeBackpack();

        // Assert backpack is no longer in cart
        assertFalse(cartPage.isProductInCart("Sauce Labs Backpack"), "Backpack was not removed from the cart");

        System.out.println(" Remove product test passed successfully.");
    }
}
