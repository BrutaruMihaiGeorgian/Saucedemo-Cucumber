package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.InventoryPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddToCartSteps {

    InventoryPage inventoryPage = new InventoryPage(Hooks.driver);

    @When("the user adds a backpack to the cart")
    public void the_user_adds_a_backpack_to_the_cart() {
        inventoryPage.addBackpackToCart();
    }

    @Then("the cart should show {int} item")
    public void the_cart_should_show_item(Integer count) {
        assertEquals(count.toString(), inventoryPage.getCartBadgeCount(), " The product was not added successfully.");
        System.out.println(" The product was added successfully ");
    }
}
