package andreeaG.teorie.seleniumBasics3.Test;

import andreeaG.driver.BrowserManager;
import andreeaG.teorie.seleniumBasics3.PageObject.EmagHomePage;
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
        driver.get ("https://www.emag.ro/");
        System.out.println("Inainte" + LocalDateTime.now());
        //driver.manage().timeouts().implicitlyWait (5, TimeUnit.SECONDS);
       // WebElement acceptButton = new WebDriverWait(driver, Duration.ofSeconds(5))
               // .until(ExpectedConditions.elementToBeClickable(By.className("js-accept")));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-accept")));
        System.out.println("Dupa" + LocalDateTime.now());
        WebElement acceptButton = driver.findElement(By.className("js-accept"));
        //acceptButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", acceptButton);
        driver.quit();
    }

    @Test
    public void openLoginTestWithPageObject() {
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        EmagHomePage emagHomePage = new EmagHomePage(driver);
        emagHomePage.clickOnAcceptButton();
        driver.quit();
    }
  @Test
    public void openMobileBrowser(){
      driver = BrowserManager.createChromeDriverForMObile();
      driver.get ("https://www.emag.ro/");
      driver.quit();
  }
}
