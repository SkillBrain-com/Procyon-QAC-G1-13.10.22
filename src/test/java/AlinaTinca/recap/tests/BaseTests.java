package alinatinca.recap.tests;

import alinatinca.driver.BrowserManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    protected ChromeDriver driver = null;

    @BeforeMethod
    public void createChromeDriver(){
        driver = BrowserManager.createChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void quitChromeDriver(){
        if(driver != null){
            driver.quit();
        }
    }
}