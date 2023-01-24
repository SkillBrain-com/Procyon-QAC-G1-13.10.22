package bogdanSandu.tests.tema8.tests;

import bogdanSandu.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected ChromeDriver driver = null;

    @BeforeMethod(onlyForGroups = {"Desktop"})
    public void beforeMethodWithLogin() {
        driver = BrowserManager.getChromeDriverForDesktop();
    }

    @BeforeMethod(onlyForGroups = {"Mobile"})
    public void beforeMethodWithoutLogin() {
        driver = BrowserManager.getChromedriverForMobile();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected FluentWait<ChromeDriver> fluentWait(ChromeDriver driver){
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(StaleElementReferenceException.class);
    }

    protected boolean isElementPresent(By locator){
        try{
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }
}
