package AdelaCiobanu.test.Tema9.Tema7;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
}
    protected RemoteWebDriver driver;

    @BeforeMethod(groups = "redirect")
    public void initChromeBrowser(){
        driver = BrowserManager.createRemoteWebDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println("Executed before method.");
    }

    @AfterMethod(groups = "redirect")
    public void quitDriver(){
        if (driver!=null){
            driver.quit();
        }
        System.out.println("Executed after method.");
    }
}
