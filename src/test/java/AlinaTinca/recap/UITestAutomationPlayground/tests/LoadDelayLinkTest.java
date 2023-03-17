package alinatinca.recap.UITestAutomationPlayground.tests;

import alinatinca.recap.SauceDemoCom.tests.BaseTests;
import alinatinca.recap.UITestAutomationPlayground.pageObjects.LoadDelayLinkPage;
import org.testng.annotations.Test;

public class LoadDelayLinkTest extends BaseTests {

    @Test(description = "verify that scenario from Load Delay web page is working")
    public void goToLoadDelayLinkTest(){
        driver.get("http://uitestingplayground.com/");
        LoadDelayLinkPage loadDelayLinkPage = new LoadDelayLinkPage(driver);
        loadDelayLinkPage.clickOnLoadDelayLink();
        System.out.println("Scenario has the following text: " + loadDelayLinkPage.getScenarioText().getText());
        loadDelayLinkPage.confirmationForButtonAppearingAfterDelay();
        System.out.println("The presence of the button has been checked on the page after delay!");
        System.out.println("Test passed!");
    }
}