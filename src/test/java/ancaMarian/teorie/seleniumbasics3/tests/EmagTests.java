package ancaMarian.teorie.seleniumbasics3.tests;

import ancaMarian.driver.BrowserManager;
import ancaMarian.teorie.seleniumbasics3.pageObject.EmagHomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class EmagTests {

    ChromeDriver driver;

    @Test
    public void openLoginTest1() { //explicit WebDriverWait
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        System.out.println("Inainte "+ LocalDateTime.now());
        WebElement acceptButton = new WebDriverWait(driver, Duration.ofSeconds(5)) .until(ExpectedConditions.
                elementToBeClickable(By.className("js-accept")));
        System.out.println("Dupa "+ LocalDateTime.now());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", acceptButton);
        driver.quit();
    }

    @Test
    public void openLoginTest2() { //explicit Fluent
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) .withTimeout(Duration.ofSeconds(15)) .pollingEvery(Duration.ofSeconds(5)) .ignoring(NoSuchElementException.class) .ignoring(TimeoutException.class); //aici il definim
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("js-accept")))); //aici il folosim
        WebElement acceptButton = driver.findElement(By.className("js-accept")); //mie mi-a mers si asa

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", acceptButton);
        driver.quit();
    }

    @Test
    public void openLoginTest3() { ///fara wait
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        WebElement acceptButton = driver.findElement(By.className("js-accept")); //mie mi-a mers si asa
        acceptButton.click();
        driver.quit();
    }

    @Test
    public void openLoginTest4() { //implicit
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        System.out.println("Inainte "+ LocalDateTime.now());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //mie mi-a mers si asa
        WebElement acceptButton = driver.findElement(By.className("js-accept"));
        System.out.println("Dupa "+ LocalDateTime.now());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", acceptButton);
        driver.quit();
    }

    @Test
    public void openLoginTestWithPageObject() {
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://emag.ro/");
        EmagHomePage emagHomePage = new EmagHomePage(driver);
        emagHomePage.clickOnAcceptButton();
        driver.quit();
    }
    @Test
    public void openMobileBrowser() {
        driver = BrowserManager.createChromeDriverForMobile();
        driver.get("https://www.emag.ro/");
        driver.quit();
    }
}
