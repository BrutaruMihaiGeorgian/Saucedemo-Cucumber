package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    // Locators
    private By checkoutButton = By.id("checkout");
    private By continueShoppingButton = By.id("continue-shopping");
    private By removeBackpackButton = By.id("remove-sauce-labs-backpack");
    private By cartItemNames = By.className("inventory_item_name");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Clicks the checkout button
    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    // Clicks the "Continue Shopping" button
    public void clickContinueShopping() {
        driver.findElement(continueShoppingButton).click();
    }

    // Removes the backpack product from the cart
    public void removeBackpack() {
        driver.findElement(removeBackpackButton).click();
    }

    // Checks if a specific product is still in the cart
    public boolean isProductInCart(String productName) {
        return driver.findElements(cartItemNames)
                .stream()
                .anyMatch(e -> e.getText().equalsIgnoreCase(productName));

    }
}
