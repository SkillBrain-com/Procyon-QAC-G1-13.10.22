package neculaclaudiu.tests.TemaIntershipAutomation.tests;

import neculaclaudiu.tests.TemaIntershipAutomation.pageObjects.GaleriaHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class HeaderTests extends BaseTest{

    @Test
    public void headerVisibility(){
        GaleriaHomePage page = new GaleriaHomePage(driver);
        Assert.assertTrue(page.checkIfTheHeaderIsVisible());
        page.scrollDown("500");
        Assert.assertTrue(page.checkIfTheHeaderIsVisible());
    }

    @Test
    public void stickyBarVisibility(){
        GaleriaHomePage page = new GaleriaHomePage(driver);
        Assert.assertTrue(page.checkIfTheStickyBarIsVisible());
        page.scrollDown("500");
        Assert.assertTrue(page.checkIfTheStickyBarIsVisible());
    }

    @Test
    public void stickyBarWebsiteAccess(){
        GaleriaHomePage page = new GaleriaHomePage(driver);
        page.clickOnStickyBar();
        Assert.assertEquals(driver.getCurrentUrl(),"https://galeria-warminska.pl/");
    }

    @Test
    public void checkIfTheLanguageButtonIsWorking(){
        GaleriaHomePage page = new GaleriaHomePage(driver);
        page.clickLanguageButton();
        driver.findElement(By.cssSelector("div.py-1 span:first-child")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://pl-galeria-warminska-uat.azurewebsites.net/"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://pl-galeria-warminska-uat.azurewebsites.net/");
    }
    @Test
    public void checkIfTheSearchBarIsWorking(){
        GaleriaHomePage page = new GaleriaHomePage(driver);
        page.clickOnSearchBoxButton();
        WebElement searchBoxInput = driver.findElement(By.cssSelector("input[name=\"search\"]"));
        searchBoxInput.sendKeys("test");
        Assert.assertEquals(searchBoxInput.getAttribute("value"), "test");
    }
}
