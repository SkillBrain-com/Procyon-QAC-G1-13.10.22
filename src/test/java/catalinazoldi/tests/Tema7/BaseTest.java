package catalinazoldi.tests.Tema7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tema7catalinaz.driver.BrowserManager;

public class BaseTest {

    protected ChromeDriver driver;


    @BeforeMethod(groups = "redirect")
    public void initChromeBrowser() {
        driver = BrowserManager.createChromeDriver();

    }
    @AfterMethod(groups = "redirect")
    public void quitDriver(){
        if(driver !=null) {
            driver.quit();
        }
        System.out.println("Executed after method");

    }
}
