package alinatinca.tests.Tema8.tests;

import alinatinca.driver.BrowserManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    protected ChromeDriver driver;

    @BeforeMethod(groups = "desktop")
    public void createChromeDriverWithOptions(){
        driver = BrowserManager.createChromeDriverWithOptions();
    }

    @BeforeMethod(groups = "mobile")
    public void createChromeDriverForMobile(){
        driver = BrowserManager.createChromeDriverForMobile();
    }

    @AfterMethod(alwaysRun = true)
    public void quitDriver() {
        if (driver!=null) {
            driver.quit();
        }
        System.out.println("Chrome instance has been closed!");
    }
}