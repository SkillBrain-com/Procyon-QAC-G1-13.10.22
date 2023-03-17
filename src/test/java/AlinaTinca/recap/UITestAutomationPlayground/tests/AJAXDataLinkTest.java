package alinatinca.recap.UITestAutomationPlayground.tests;

import alinatinca.recap.SauceDemoCom.tests.BaseTests;
import alinatinca.recap.UITestAutomationPlayground.pageObjects.AJAXDataLinkPage;
import org.testng.annotations.Test;

public class AJAXDataLinkTest extends BaseTests {

    @Test(description = "verify that scenario from AJAX Data web page is working")
    public void goToAjaxDataLinkTest(){
        driver.get("http://uitestingplayground.com/");
        AJAXDataLinkPage ajaxDataLinkPage = new AJAXDataLinkPage(driver);
        ajaxDataLinkPage.clickOnAjaxDataLink();
        System.out.println("Scenario has the following text: " + ajaxDataLinkPage.getScenarioText().getText());
        ajaxDataLinkPage.clickOnButtonTriggeringAJAXRequest();
        ajaxDataLinkPage.confirmationMessage();
        System.out.println("The presence of Button Triggering AJAX Request on the page has been checked!");
    }
}