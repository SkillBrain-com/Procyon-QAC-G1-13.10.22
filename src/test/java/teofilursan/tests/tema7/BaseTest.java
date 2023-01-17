package teofilursan.tests.tema7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import teofilursan.driver.BrowserManager;

public class BaseTest {

    protected ChromeDriver driver;

    @BeforeMethod(groups = "redirect")
    public void initChromeBrowser() {
        driver = BrowserManager.createChromeDriver();
        System.out.println("Executed before method");
    }

    @AfterMethod(groups = "redirect")
    public void quitDriver() {
        if (driver!=null) {
            driver.quit();
        }
        System.out.println("Executed after method");
    }
}
