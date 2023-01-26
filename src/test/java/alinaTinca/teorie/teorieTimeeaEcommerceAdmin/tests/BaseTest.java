package alinatinca.teorie.teorieTimeeaEcommerceAdmin.tests;

import alinatinca.driver.BrowserManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

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

    //Definim aici o metoda protected care va fi mostenita de clasele de test in care vom apela aceasta metoda cand va fi nevoie
    protected FluentWait<ChromeDriver> getWait(ChromeDriver driver){
        FluentWait<ChromeDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(5)) //sa astepte 5 sec pana gaseste elementul
                .pollingEvery(Duration.ofMillis(500));  //la intervalul de jumatate de sec sa reincerce verificarile pe pagina
        return wait;
    }
}
