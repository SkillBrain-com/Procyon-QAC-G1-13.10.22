package alinatinca.tests.Tema8.tests;

import alinatinca.driver.BrowserManager;
import alinatinca.tests.Tema8.pageObjects.DisabledDynamicButtonConfirmationPage;
import alinatinca.tests.Tema8.pageObjects.DisabledDynamicButtonsPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledDynamicButtonsPageTest extends BaseTest {
    @Test(groups = {"mobile", "desktop"})
    public void clickOnAllButtons() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
        DisabledDynamicButtonConfirmationPage disabledDynamicButtonConfirmationPage = new DisabledDynamicButtonConfirmationPage(driver);
        Assert.assertEquals(disabledDynamicButtonConfirmationPage.displayTextForClickAllButtons(), "Click Buttons In Order");
        System.out.println("The message that appears before openening all the buttons is: " + disabledDynamicButtonConfirmationPage.displayTextForClickAllButtons());
        DisabledDynamicButtonsPage disabledDynamicButtonsPage = new DisabledDynamicButtonsPage(driver);
        disabledDynamicButtonsPage.clickOnStartButton();
        disabledDynamicButtonsPage.clickOnOneButton();
        disabledDynamicButtonsPage.clickOnSecondButton();
        disabledDynamicButtonsPage.clickOnThirdButton();
        Assert.assertEquals(disabledDynamicButtonConfirmationPage.displayTextForClickAllButtons(), "All Buttons Clicked");
        System.out.println("The message that appears after opening all the buttons is: " + disabledDynamicButtonConfirmationPage.displayTextForClickAllButtons());
        System.out.println("Check was done successfully!");
    }
}