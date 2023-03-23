package AdelaCiobanu.test.Tema9.Tema8.Teste;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected RemoteWebDriver driver;

    @BeforeMethod(groups = "desktop")
    public void createRemoteWebDriverForDesktop(){
        driver = BrowserManager.createRemoteWebDriverForDesktop();
    }

    @BeforeMethod(groups = "mobile")
    public void createRemoteWebDriverForMobile(){
        driver = BrowserManager.createRemoteWebDriverForMobile();
    }

    @AfterMethod(alwaysRun = true)
    public void quitDriver() {
        if (driver!=null) {
            driver.quit();
        }
    }
}

