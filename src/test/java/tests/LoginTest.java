package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

    @Test
    public void testLoginWithValidCredentials() {
        // Setting Chrome in incognito mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        // Launch browser
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // Site access
        driver.get("https://www.saucedemo.com/");

        // Create LoginPage object and use login method
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        //URL verification after login
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        assertEquals(expectedUrl, actualUrl, " Login Fail !");

        System.out.println(" Login successfully");

        // Close browser
        driver.quit();
    }
}
