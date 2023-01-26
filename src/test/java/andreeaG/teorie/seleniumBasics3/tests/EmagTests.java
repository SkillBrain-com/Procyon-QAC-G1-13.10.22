package andreeaG.teorie.seleniumBasics3.tests;


import andreeaG.driver.BrowserManager;
import andreeaG.teorie.seleniumBasics3.pageObjects.EmagHomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDateTime;

public class EmagTests {
  // For Selenium basics 3
    //ChromeDriver driver;


    //Remote ChromeDriver for Selenium Grid
    RemoteWebDriver driver;

    @Test
    public void openLoginTest(){

        //driver for Basics 3
        //driver= BrowserManager.createChromeDriverWithOptions();

        //driver for Selenium Grid
        driver= BrowserManager.createRemoteWebDriver();
        driver.get("https://www.emag.ro/");
        System.out.println("Inainte " + LocalDateTime.now());
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebElement acceptButton = new WebDriverWait(driver, Duration.ofSeconds(5))
        //       .until(ExpectedConditions.elementToBeClickable(By.className("js-accept")));
        System.out.println("Dupa " + LocalDateTime.now());
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-accept")));
        WebElement acceptButton = driver.findElement(By.className("js-accept"));
        // acceptButton.click();
        JavascriptExecutor js =(JavascriptExecutor)  driver;
        js.executeScript("arguments[0].click();", acceptButton);
        driver.quit();
    }

    @Test
    public void openLoginTestWithPageObject(){
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro");
        EmagHomePage emagHomePage = new EmagHomePage(driver);
        emagHomePage.clickOnAcceptButton();
        driver.quit();
    }


    @Test
    public void openMobileBrowser(){
        driver= BrowserManager.createChromeDriverForMobile();
        driver.get("https://www.emag.ro/");
        driver.quit();
    }
}
