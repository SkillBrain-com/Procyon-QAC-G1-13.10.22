package ancaMarian.tests.tema8.tests;

import ancaMarian.tests.tema8.pageObjects.DisabledDynamicButtonsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DisabledDynamicButtonsPageTest extends BaseTest {

    @Test(groups = {"mobile", "desktop"})
    public void dynamicButtonsPageTest() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
        DisabledDynamicButtonsPage disabledDynamicButtonsPage = new DisabledDynamicButtonsPage(driver);
        disabledDynamicButtonsPage.waitForStartButtonToBeClickable();
        disabledDynamicButtonsPage.clickOnStartButton();
        disabledDynamicButtonsPage.waitForOneButtonToBeClickable();
        disabledDynamicButtonsPage.clickOnOneButton();
        disabledDynamicButtonsPage.waitForWaitMessageToDisappear();
        disabledDynamicButtonsPage.clickOnTwoButton();
        disabledDynamicButtonsPage.waitForWaitMessageToDisappear();
        disabledDynamicButtonsPage.clickOnThreeButton();
        WebElement confirmationMessage = driver.findElement(By.id("buttonmessage"));
        Assert.assertEquals(confirmationMessage.getText(), "All Buttons Clicked");
    }
}
