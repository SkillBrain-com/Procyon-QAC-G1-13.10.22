package elizCurtnazar.tests.tema8.teste;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import teofilursan.driver.BrowserManager;

import java.time.Duration;

public class BaseTest {

    protected ChromeDriver driver;

    @BeforeMethod()
    public void initChromeBrowser() {
        driver = BrowserManager.createChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//
        System.out.println("Executed before method");
    }

    @AfterMethod(alwaysRun = true)
    public void quitDriver() {
        if (driver!=null) {
            driver.quit();
        }
        System.out.println("Executed after method");
    }
}

//ex.3 ora.2.34
//La punctul 2 de la tema 8 ->  https://testpages.herokuapp.com/styled/javascript-redirect-test.html -
// se vor verifica butoanele care redirectează către o pagină noua, folosind wait si windowHandles ->
// ignorati, va rog, partea cu windowHandles fiindca nu se aplica. Multumesc

//ex5.ora2.53