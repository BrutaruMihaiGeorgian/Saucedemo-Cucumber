package tests;

import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddSixProductsTest extends tests.BaseTest {

    @Test
    public void testAddSixProductsToCart() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);

        // Add all 6 products
        inventoryPage.addBackpackToCart();
        inventoryPage.addBikeLightToCart();
        inventoryPage.addBoltTShirtToCart();
        inventoryPage.addFleeceJacketToCart();
        inventoryPage.addOnesieToCart();
        inventoryPage.addRedTShirtToCart();

        // Check the cart badge
        assertEquals("6", inventoryPage.getCartBadgeCount(), " Not all products were added to the cart!");
        System.out.println("All 6 products have been successfully added to cart. ");
    }
}
