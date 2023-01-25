package alinatinca.tests.Tema8.tests;

import alinatinca.driver.BrowserManager;
import alinatinca.tests.Tema8.pageObjects.JavaScriptRedirectsConfirmationPage;
import alinatinca.tests.Tema8.pageObjects.JavaScriptRedirectsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class JavaScriptRedirectsPageTests extends BaseTest{
    @Test(groups = {"mobile", "desktop"})
    public void clickOnFirstButton() {
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        JavaScriptRedirectsPage javaScriptRedirectsPage = new JavaScriptRedirectsPage(driver);
        System.out.println("The message in the paragraph on the first page is: " + javaScriptRedirectsPage.getParagraph());
        javaScriptRedirectsPage.clickOnFirstButton();
        JavaScriptRedirectsConfirmationPage javaScriptRedirectsConfirmationPage = new JavaScriptRedirectsConfirmationPage(driver);
//        Assert.assertEquals(driver.getCurrentUrl(),
//                "https://testpages.herokuapp.com/styled/redirected.html");
        Assert.assertEquals(javaScriptRedirectsConfirmationPage.displayText(), "You have been successfully redirected.");
        System.out.println("The message from the new window has been displayed: " + javaScriptRedirectsConfirmationPage.displayText());
        System.out.println("Check was done successfully!");
        javaScriptRedirectsConfirmationPage.clickOnBackButton();
    }
    @Test(groups = {"mobile", "desktop"})
    public void clickOnSecondButton(){
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        JavaScriptRedirectsPage javaScriptRedirectsPage = new JavaScriptRedirectsPage(driver);
        System.out.println("The message in the paragraph on the first page is: " + javaScriptRedirectsPage.getParagraph());
        javaScriptRedirectsPage.clickOnSecondButton();
        JavaScriptRedirectsConfirmationPage javaScriptRedirectsConfirmationPage = new JavaScriptRedirectsConfirmationPage(driver);
        Assert.assertEquals(javaScriptRedirectsConfirmationPage.displayText(), "You have been successfully redirected.");
        System.out.println("The message from the new window has been displayed: " + javaScriptRedirectsConfirmationPage.displayText());
        System.out.println("Check was done successfully!");
        javaScriptRedirectsConfirmationPage.clickOnBackButton();
    }
}