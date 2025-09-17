package hooks;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup() {
        // We use WebDriverManager to download the correct driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

       // Maximize the window
        driver.manage().window().maximize();

        // Set a short implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // Navigate to the application
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void teardown() {
        if (driver != null) {
            try {
                driver.quit(); // Quickly close the session
            } catch (Exception e) {
                System.out.println("The browser has already been closed: " + e.getMessage());
            }
        }
    }
}
