package alinaTinca.tests.Tema7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tincaalina.BrowserManager;

public abstract class BaseTest {

    protected ChromeDriver driver = null;

    @BeforeMethod
    public void beforeMethod() {
        driver = BrowserManager.createChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println("Katalon Demo Cura page has been opened!");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver instance has been closed!");
        }
    }
}
