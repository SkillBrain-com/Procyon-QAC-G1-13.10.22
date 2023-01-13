package sorinfoca.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import sorinfoca.driver.BrowserManager;

public class TestConfig {
    private static String baseUrl = "https://katalon-demo-cura.herokuapp.com/";
    private ChromeDriver driver;

    public static String getBaseUrl() {
        return baseUrl;
    }

    @BeforeMethod
    public void beforeEach() {
        driver = BrowserManager.createChromeDriver();
    }
}

