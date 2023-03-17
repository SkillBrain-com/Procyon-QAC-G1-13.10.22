package alinatinca.recap.UITestAutomationPlayground.tests;

import alinatinca.recap.SauceDemoCom.tests.BaseTests;
import alinatinca.recap.UITestAutomationPlayground.pageObjects.TextInputLinkPage;
import org.testng.annotations.Test;

public class TextInputLinkTest extends BaseTests {

    @Test(description = "verify the scenario from Text Input page is working")
    public void goToTextInputLinkTest(){
        driver.get("http://uitestingplayground.com/");
        TextInputLinkPage textInputLinkPage = new TextInputLinkPage(driver);
        textInputLinkPage.clickOnTextInputLink();
        System.out.println("Scenario has the following text: " + textInputLinkPage.getScenarioText().getText());
        textInputLinkPage.inputInMyButtonField();
        textInputLinkPage.clickOnButtonThatShouldChangeInput();
        textInputLinkPage.assertInputValue();
        System.out.println("Test passed!");
    }
}