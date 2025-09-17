package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.InventoryPage;

public class AddSixProductsSteps {

    InventoryPage inventoryPage = new InventoryPage(Hooks.driver);

    @When("the user adds all six products to the cart")
    public void the_user_adds_all_six_products_to_the_cart() {
        inventoryPage.addBackpackToCart();
        inventoryPage.addBikeLightToCart();
        inventoryPage.addBoltTShirtToCart();
        inventoryPage.addFleeceJacketToCart();
        inventoryPage.addOnesieToCart();
        inventoryPage.addRedTShirtToCart();
    }
    @Then("the cart should show {int} items")
    public void the_cart_should_show_items(Integer expectedCount) {
        // Just read the number of products in the cart
        String actualCount = inventoryPage.getCartBadgeCount();
        System.out.println("Number of products in the cart: " + actualCount);
    }



    }

