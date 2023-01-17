package alinaTinca.tests.Tema7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tincaalina.BrowserManager;

public abstract class BaseTest {

    ChromeDriver driver = null;

    public String url = "https://katalon-demo-cura.herokuapp.com/";

    @BeforeMethod
    public void beforeMethod(){
       driver = BrowserManager.createChromeDriver();
       //create the driver instance
       System.out.println("Driver instance has been created!");
       //display the above message
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        if(driver != null){
        driver.quit();
        //Driver instance has been closed
        System.out.println("Driver instance has been closed!");
        //display the above message
        }
    }
}
