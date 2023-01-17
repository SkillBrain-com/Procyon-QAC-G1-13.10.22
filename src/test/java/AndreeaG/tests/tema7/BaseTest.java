package AndreeaG.tests.tema7;

import AndreeaG.driver.BrowserManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected ChromeDriver driver;

    @BeforeMethod
    public void initChromeBrowser(){
       driver = BrowserManager.createChromeDriver();
    }
    @AfterMethod
    public void quitDriver(){
        if (driver!=null){
            driver.quit();
        }
        System.out.println ("Am executat");
    }
}
