package ancaMarian.tests.tema8.tests;

import ancaMarian.driver.BrowserManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected ChromeDriver driver;

    @BeforeMethod()
    public void initializeChromeBrowser() {
        driver = BrowserManager.createDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Executed before method.");
    }

    @AfterMethod(alwaysRun = true)
    public void quitDriver() {
        if (driver!=null) {
            driver.quit();
        }
        System.out.println("Executed after method.");
    }
}
