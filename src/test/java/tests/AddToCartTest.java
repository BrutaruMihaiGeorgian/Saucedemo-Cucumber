package tests;

import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddToCartTest extends tests.BaseTest {

    @Test
    public void testAddBackpackToCart() {
        // Create a LoginPage object and perform login with valid credentials
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Create InventoryPage object to interact with products page
        InventoryPage inventoryPage = new InventoryPage(driver);
        // Add the backpack product to the cart
        inventoryPage.addBackpackToCart();

        // Verify that the cart badge shows "1" indicating one product was added
        assertEquals("1", inventoryPage.getCartBadgeCount(), "The product was not added successfully.");

        // Print confirmation message to the console with a shopping cart emoji
        System.out.println("The product was added successfully. ");
    }
}
