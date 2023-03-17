package alinatinca.recap.UITestAutomationPlayground.tests;

import alinatinca.recap.SauceDemoCom.tests.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProgressBarLinkTest extends BaseTests {

    @Test(description = "verify that scenario from Progress Bar page is working")
    public void goToProgressBarLinkTest() {
        driver.navigate().to("http://uitestingplayground.com/");
        WebElement progressBarLink = driver.findElement(By.cssSelector("a[href=\"/progressbar\"]"));
        progressBarLink.click();
        WebElement stopButton = driver.findElement(By.id("stopButton"));
        WebElement progressBar = driver.findElement(By.id("progressBar"));
        WebElement startButton = driver.findElement(By.id("startButton"));
        startButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(21));
//        wait.pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "76"));
        stopButton.click();
    }
}