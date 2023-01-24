package bogdanSandu.tests.tema8.tests;

import bogdanSandu.tests.tema8.pageObjects.DynamicButtonsDisabledPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static bogdanSandu.tests.tema8.pageObjects.DynamicButtonsDisabledPage.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicButtonsDisabledPageTest extends BaseTest {

    @Test(groups = "Desktop")
    public void dynamicButtonDisabledTestForDesktop(){
        System.out.println("Dynamic button disabled test Desktop");
        DynamicButtonsDisabledPage dynamicButtonsDisabledPage = new DynamicButtonsDisabledPage(driver);
        driver.get(START_PAGE_URL);
        System.out.println("Got to 'Disabled Dynamic Buttons' link");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_START)));
        dynamicButtonsDisabledPage.getStartButton().click();
        System.out.println("Click on start button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_ONE)));
        dynamicButtonsDisabledPage.getOneButton().click();
        System.out.println("Click on 'One' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_TWO)));
        dynamicButtonsDisabledPage.getTwoButton().click();
        System.out.println("Click on 'Two' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_THREE)));
        dynamicButtonsDisabledPage.getThreeButton().click();
        System.out.println("Click on 'Three' button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(MESSAGE)));
        System.out.println(dynamicButtonsDisabledPage.getMessage().getText());

        assertTrue(isElementPresent(By.id(MESSAGE)),"The message was not displayed even though I pressed all the buttons");
        assertEquals(dynamicButtonsDisabledPage.getMessage().getText(),"All Buttons Clicked","The corresponding message was not displayed");
    }

    @Test(groups = "Mobile")
    public void dynamicButtonDisabledTestForMobile(){
        System.out.println("Dynamic button disabled test Mobile");
        DynamicButtonsDisabledPage dynamicButtonsDisabledPage = new DynamicButtonsDisabledPage(driver);
        driver.get(START_PAGE_URL);
        System.out.println("Got to 'Disabled Dynamic Buttons' link");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_START)));
        dynamicButtonsDisabledPage.getStartButton().click();
        System.out.println("Click on start button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_ONE)));
        dynamicButtonsDisabledPage.getOneButton().click();
        System.out.println("Click on 'One' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_TWO)));
        dynamicButtonsDisabledPage.getTwoButton().click();
        System.out.println("Click on 'Two' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_THREE)));
        dynamicButtonsDisabledPage.getThreeButton().click();
        System.out.println("Click on 'Three' button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(MESSAGE)));
        System.out.println(dynamicButtonsDisabledPage.getMessage().getText());

        assertTrue(isElementPresent(By.id(MESSAGE)),"The message was not displayed even though I pressed all the buttons");
        assertEquals(dynamicButtonsDisabledPage.getMessage().getText(),"All Buttons Clicked","The corresponding message was not displayed");
    }
}
