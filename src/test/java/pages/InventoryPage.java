package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Selectors for the example products
    private By backpackAddButton = By.id("add-to-cart-sauce-labs-backpack");
    private By bikeLightAddButton = By.id("add-to-cart-sauce-labs-bike-light");
    private By boltShirtAddButton = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By fleeceJacketAddButton = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By onesieAddButton = By.id("add-to-cart-sauce-labs-onesie");
    private By redTShirtAddButton = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private By cartBadge = By.className("shopping_cart_badge");

    public void addBackpackToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(backpackAddButton)).click();
    }

    public void addBikeLightToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(bikeLightAddButton)).click();
    }

    public void addBoltTShirtToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(boltShirtAddButton)).click();
    }

    public void addFleeceJacketToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(fleeceJacketAddButton)).click();
    }

    public void addOnesieToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(onesieAddButton)).click();
    }

    public void addRedTShirtToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(redTShirtAddButton)).click();
    }

    public String getCartBadgeCount() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cartBadge)).getText();
    }
    public pages.CartPage goToCart() {
        driver.findElement(By.id("shopping_cart_container")).click(); // Click on the cart icon
        return new pages.CartPage(driver);
    }

    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutLink = By.id("logout_sidebar_link");

    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton)).click(); // Open the menu
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click(); // Click on logout
        System.out.println("User logged out successfully");
    }

}



