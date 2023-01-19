package cosminsechel.teorie.seleniumbasics3;

import cosminsechel.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class EmagTests {

    ChromeDriver driver;
    @Test
    public void openLoginTest() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        System.out.println(LocalDateTime.now());
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebElement acceptButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                //.until(ExpectedConditions.elementToBeClickable(By.className("js-accept")));
        WebElement acceptButton = driver.findElement(By.className("js-accept"));
        //acceptButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", acceptButton);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.className("js-accept")));
        driver.quit();

    }
    @Test
    public void openMobileBrowser() {
        driver = BrowserManager.createChromeDriverForMobile();
        driver.get("https://www.emag.ro/");
        driver.quit();
    }
}
