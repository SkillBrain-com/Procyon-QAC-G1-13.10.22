package madalinapopescu.teorie.seleniumbasics3.tests;

import madalinapopescu.driver.BrowserManager;
import madalinapopescu.teorie.seleniumbasics3.pageObject.EmagHomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDateTime;

public class EmagHomeTests {
    ChromeDriver driver;
    @Test
    public void openLoghinTest(){   // aceasta metoda imi deschide chromul pe toata pagina
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        System.out.println("Inainte " + LocalDateTime.now());
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement acceptButton = new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions
//                        .elementToBeClickable(By.className("js-accept")));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-accept")));
        System.out.println("Dupa " + LocalDateTime.now());
        WebElement acceptButton = driver.findElement(By.className("js-accept"));
//        acceptButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", acceptButton);
        driver.quit();
    }
    @Test
    public void openMobileBrowser(){   //aceasta metoda imi deschide pe chrome varianta de  mobil versiunea pe care i-am spuso eu
        driver = BrowserManager.createChromeDriverForMobile();
        driver.get("https://www.emag.ro/");
        driver.quit();
    }
    @Test
    public void openLoghinTestWithPageObject(){
        driver =BrowserManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        EmagHomePage emagHomePage = new EmagHomePage(driver);
        emagHomePage.clickOnAcceptButton();
        driver.quit();
    }
}
