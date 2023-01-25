package alinatinca.teorie.teorieTimeeaEcommerceAdmin.tests;

import alinatinca.driver.BrowserManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected ChromeDriver driver;

    //Definim crearea de Driver pentru desktop (apeland-o din BrowserManager acolo unde am creat-o)
    @BeforeClass()
    public void beforeMethodForDesktop(){
        driver = BrowserManager.createChromeDriverWithOptions();
    }

    //Definim crearea de Driver pentru mobile(apeland-o din BrowserManager acolo unde am creat-o)
//    @BeforeMethod()
//    public void beforeMethodForMobile(){
//        driver = BrowserManager.createChromeDriverForMobile();
//    }

    //Definim inchiderea de Driver Chrome
    @AfterClass(alwaysRun = true)
    public void afterMethod(){
        if(driver != null){
            driver.quit();
        }
    }
}
