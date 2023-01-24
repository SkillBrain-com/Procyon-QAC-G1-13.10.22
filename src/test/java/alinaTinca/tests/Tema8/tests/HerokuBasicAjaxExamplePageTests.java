package alinatinca.tests.Tema8.tests;

import alinatinca.tests.Tema8.pageObjects.HerokuBasicAjaxExampleConfirmationPage;
import alinatinca.tests.Tema8.pageObjects.HerokuBasicAjaxExamplePage;
import alinatinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HerokuBasicAjaxExamplePageTests {

    ChromeDriver driver;

    public void getParagraph() {
        WebElement paragraph = driver.findElement(By.className("explanation"));
        System.out.println(paragraph.getText());
    }

    @Test(groups = {"mobile", "desktop"})
    public void getFirstCategory() {
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        HerokuBasicAjaxExamplePage herokuBasicAjaxExamplePage = new HerokuBasicAjaxExamplePage(driver);
        herokuBasicAjaxExamplePage.selectCategory("Web");
        System.out.println("Web item from drop down category list has been selected!");
        herokuBasicAjaxExamplePage.selectLanguage("Javascript");
        System.out.println("Javascript item from drop down language list has been selected!");
        herokuBasicAjaxExamplePage.clickOnCodeInIt();
        HerokuBasicAjaxExampleConfirmationPage herokuBasicAjaxExampleConfirmationPage = new HerokuBasicAjaxExampleConfirmationPage(driver);
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryID(), "1");
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryLanguage(), "1");
        driver.quit();
    }

    @Test(groups = {"mobile", "desktop"})
    public void getSecondCategory() {
        driver = BrowserManager.createChromeDriverForMobile();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        HerokuBasicAjaxExamplePage herokuBasicAjaxExamplePage = new HerokuBasicAjaxExamplePage(driver);
        herokuBasicAjaxExamplePage.selectCategory("Desktop");
        System.out.println("Desktop item from drop down category list has been selected!");
        herokuBasicAjaxExamplePage.selectLanguage("C++");
        System.out.println("C++ item from drop down language list has been selected!");
        herokuBasicAjaxExamplePage.clickOnCodeInIt();
        HerokuBasicAjaxExampleConfirmationPage herokuBasicAjaxExampleConfirmationPage = new HerokuBasicAjaxExampleConfirmationPage(driver);
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryID(), "2");
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryLanguage(), "10");
    }

    @Test(groups = {"mobile", "desktop"})
    public void getThirdCategory() {
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        HerokuBasicAjaxExamplePage herokuBasicAjaxExamplePage = new HerokuBasicAjaxExamplePage(driver);
        herokuBasicAjaxExamplePage.selectCategory("Server");
        System.out.println("Server item from drop down category list has been selected!");
        herokuBasicAjaxExamplePage.selectLanguage("Java");
        System.out.println("Java item from drop down language list has been selected!");
        herokuBasicAjaxExamplePage.clickOnCodeInIt();
        HerokuBasicAjaxExampleConfirmationPage herokuBasicAjaxExampleConfirmationPage = new HerokuBasicAjaxExampleConfirmationPage(driver);
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryID(), "3");
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryLanguage(), "23");
    }
}
