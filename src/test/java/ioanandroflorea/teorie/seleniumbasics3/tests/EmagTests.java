package ioanandroflorea.teorie.seleniumbasics3.tests;

import ioanandroflorea.driver.BrowserManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDateTime;

public class EmagTests {
    ChromeDriver driver;
    @Test
    public void openLoginTest(){
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        System.out.println("Inainte" + LocalDateTime.now());
//        WebElement acceptButton = new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.
//                        elementToBeClickable(By.className("js-accept")));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.className("js-accept")));
        System.out.println("Dupa" + LocalDateTime.now());
        WebElement acceptButton = driver.findElement(By.className("js-accept"));
//        acceptButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", acceptButton);
        driver.quit();
    }
    @Test
    public void openLoginTestWithPageObjects(){


    }
    @Test
    public void openMobileBrowser(){
        driver = BrowserManager.createChromeDriverForMobile();
        driver.get("https://www.emag.ro/");
        driver.quit();
    }
}


