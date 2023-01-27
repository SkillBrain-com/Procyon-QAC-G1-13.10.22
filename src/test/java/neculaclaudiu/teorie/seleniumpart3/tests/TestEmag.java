package neculaclaudiu.teorie.seleniumpart3.tests;

import neculaclaudiu.driver.ChromeDriverManager;
import neculaclaudiu.teorie.seleniumpart3.pageObjects.EmagHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestEmag {

    ChromeDriver driver;
    @Test
    public void openLoginTest(){
        driver = ChromeDriverManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        EmagHomePage emagHomePage = new EmagHomePage(driver);
        emagHomePage.clickOnAcceptButton();
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement acceptButton = new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.className("js-accept")));
        //acceptButton.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", acceptButton);
        driver.quit();
    }
    @Test
    public void openLoginTestWithPageObject(){
        driver = ChromeDriverManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        EmagHomePage emagHomePage = new EmagHomePage(driver);
        emagHomePage.clickOnAcceptButton();
        driver.quit();
    }
    @Test
    public void openMobileBrowser() {
        driver = ChromeDriverManager.createChromeDriverForMobile();
        driver.get("https://www.emag.ro/");
    }
}
