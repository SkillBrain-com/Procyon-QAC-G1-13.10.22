package ancaMarian.tests.tema9.tema8.tests;

import ancaMarian.tests.tema9.tema8.pageObjects.JavaScriptRedirectPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptRedirectPageTest extends BaseTest {

    @Test(groups = {"mobile", "desktop"})
    public void javaScriptRedirectIn5SecondsPageTest() {
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        JavaScriptRedirectPage javaScriptRedirectPage = new JavaScriptRedirectPage(driver);
        javaScriptRedirectPage.clickOnRedirectIn5SecondsButton();
        javaScriptRedirectPage.waitForRedirect();
        Assert.assertEquals(driver.getCurrentUrl(), "https://testpages.herokuapp.com/styled/redirected.html");
    }

    @Test(groups = {"mobile", "desktop"})
    public void javaScriptRedirectIn2SecondsPageTest() {
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        JavaScriptRedirectPage javaScriptRedirectPage = new JavaScriptRedirectPage(driver);
        javaScriptRedirectPage.clickOnRedirectIn2SecondsButton();
        javaScriptRedirectPage.waitForRedirect();
        Assert.assertEquals(driver.getCurrentUrl(), "https://testpages.herokuapp.com/styled/redirected.html");
    }
}
