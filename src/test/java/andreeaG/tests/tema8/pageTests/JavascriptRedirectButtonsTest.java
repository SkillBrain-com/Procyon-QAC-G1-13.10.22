package andreeaG.tests.tema8.pageTests;

import andreeaG.tests.tema8.pageObjects.JavascriptRedirectButtons;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavascriptRedirectButtonsTest extends BaseTest{

        @Test(groups = {"mobile","desktop"})
        public void verifyRedirectJavascript() {
            driver =new ChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
            JavascriptRedirectButtons javascriptRedirectButtons = new JavascriptRedirectButtons(driver);
            javascriptRedirectButtons.clickOn5Seconds();
            javascriptRedirectButtons.clickOn2seconds();
            Assert.assertEquals("JavaScript Redirect Test Page", driver.getTitle());
        }
    }

