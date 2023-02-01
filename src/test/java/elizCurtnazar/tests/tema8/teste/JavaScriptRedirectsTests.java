package elizCurtnazar.tests.tema8.teste;

import elizCurtnazar.tests.tema8.pageObject.JavaScriptLandingPage;
import elizCurtnazar.tests.tema8.pageObject.JavaScriptRedirectsPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaScriptRedirectsTests extends BaseTest {

    @Test(groups = {"mobile","desktop"})
    public void clickFirstButton() {
           driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
           JavaScriptRedirectsPage javaScriptRedirectsPage = new JavaScriptRedirectsPage(driver);
           javaScriptRedirectsPage.getParagraphText();
           javaScriptRedirectsPage.clickFirstButton();
           JavaScriptLandingPage javaScriptLandingPage = new JavaScriptLandingPage(driver);
           javaScriptLandingPage.getTextofParagraph();
           javaScriptLandingPage.clickGoBackButton();
       }

     @Test(groups = {"mobile","desktop"})
    public void clickSecondButton() {
         driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         JavaScriptRedirectsPage javaScriptRedirectsPage = new JavaScriptRedirectsPage(driver);
         javaScriptRedirectsPage.getParagraphText();
         javaScriptRedirectsPage.clickSecondButton();
         JavaScriptLandingPage javaScriptLandingPage = new JavaScriptLandingPage(driver);
         javaScriptLandingPage.getTextofParagraph();
         javaScriptLandingPage.clickGoBackButton();
     }
}