package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.InventoryPage;
import pages.CartPage;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class RemoveProductSteps {

    InventoryPage inventoryPage = new InventoryPage(Hooks.driver);
    CartPage cartPage;

    @Given("the user has added a backpack to the cart")
    public void the_user_has_added_a_backpack_to_the_cart() {
        inventoryPage.addBackpackToCart();
        cartPage = inventoryPage.goToCart(); // Navigate to the cart
    }

    @When("the user removes the backpack from the cart")
    public void the_user_removes_the_backpack_from_the_cart() {
        cartPage.removeBackpack();
    }

    @Then("the cart should not contain {string}")
    public void the_cart_should_not_contain(String productName) {
        assertFalse(cartPage.isProductInCart(productName),
                productName + " was not removed from the cart");
        System.out.println(productName + " removed successfully from the cart");
    }
}
