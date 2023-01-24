package alinatinca.tests.Tema7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import alinatinca.driver.BrowserManager;

public class BaseTest {

    protected ChromeDriver driver;
    //create a driver attribute protected

    @BeforeMethod(groups = "redirect")
    public void initChromeBrowser(){
        driver = BrowserManager.createChromeDriver();
        //create the driver instance
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //go to CuraHealthcare page
        System.out.println("Executed before method!");
}
    @AfterMethod(groups = "redirect")
    public void quitDriver(){
        if(driver != null){
            driver.quit();
            //close the driver instance
        }
        System.out.println("Executed after method!");
    }
}