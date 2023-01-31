package andreeaG.tests.tema8.pageTests;

import andreeaG.driver.BrowserManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected ChromeDriver driver;


    @BeforeMethod(onlyForGroups = "desktop")
    public void desktopTest() {
        driver= BrowserManager.createChromeDriverWithOptions();
    }
    @BeforeMethod(onlyForGroups = "mobile")
    public void mobileTest(){
        driver =BrowserManager.createChromeDriverForMobile();
    }
    @AfterMethod(alwaysRun = true)
    public void quitDriver() {
        if (driver!=null) {
            driver.quit();
        }
        System.out.println("Executed after method");
    }
}
