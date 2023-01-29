package alinatinca.tests.Tema8.tests;

import alinatinca.tests.Tema8.pageObjects.BasicAjaxExampleConfirmationPage;
import alinatinca.tests.Tema8.pageObjects.BasicAjaxExamplePage;
import alinatinca.driver.BrowserManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAjaxExamplePageTests extends BaseTest{

    @Test(groups = {"mobile", "desktop"})
    public void getFirstCategory() {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        BasicAjaxExamplePage herokuBasicAjaxExamplePage = new BasicAjaxExamplePage(driver);
        System.out.println("The message from the paragraph is: " + herokuBasicAjaxExamplePage.displayParagraph());
        herokuBasicAjaxExamplePage.selectCategory("Web");
        System.out.println("Web item from drop down category list has been selected!");
        herokuBasicAjaxExamplePage.selectLanguage("Javascript");
        System.out.println("Javascript item from drop down language list has been selected!");
        herokuBasicAjaxExamplePage.clickOnCodeInIt();
        BasicAjaxExampleConfirmationPage herokuBasicAjaxExampleConfirmationPage = new BasicAjaxExampleConfirmationPage(driver);
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryID(), "1");
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryLanguage(), "1");
    }

    @Test(groups = {"mobile", "desktop"})
    public void getSecondCategory() {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        BasicAjaxExamplePage herokuBasicAjaxExamplePage = new BasicAjaxExamplePage(driver);
        System.out.println("The message from the paragraph is: " + herokuBasicAjaxExamplePage.displayParagraph());
        herokuBasicAjaxExamplePage.selectCategory("Desktop");
        System.out.println("Desktop item from drop down category list has been selected!");
        herokuBasicAjaxExamplePage.selectLanguage("C++");
        System.out.println("C++ item from drop down language list has been selected!");
        herokuBasicAjaxExamplePage.clickOnCodeInIt();
        BasicAjaxExampleConfirmationPage herokuBasicAjaxExampleConfirmationPage = new BasicAjaxExampleConfirmationPage(driver);
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryID(), "2");
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryLanguage(), "10");
    }

    @Test(groups = {"mobile", "desktop"})
    public void getThirdCategory() {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        BasicAjaxExamplePage herokuBasicAjaxExamplePage = new BasicAjaxExamplePage(driver);
        System.out.println("The message from the paragraph is: " + herokuBasicAjaxExamplePage.displayParagraph());
        herokuBasicAjaxExamplePage.selectCategory("Server");
        System.out.println("Server item from drop down category list has been selected!");
        herokuBasicAjaxExamplePage.selectLanguage("Java");
        System.out.println("Java item from drop down language list has been selected!");
        herokuBasicAjaxExamplePage.clickOnCodeInIt();
        BasicAjaxExampleConfirmationPage herokuBasicAjaxExampleConfirmationPage = new BasicAjaxExampleConfirmationPage(driver);
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryID(), "3");
        Assert.assertEquals(herokuBasicAjaxExampleConfirmationPage.getCategoryLanguage(), "23");
    }
}