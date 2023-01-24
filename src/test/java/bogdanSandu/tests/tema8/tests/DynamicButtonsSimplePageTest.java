package bogdanSandu.tests.tema8.tests;

import bogdanSandu.tests.tema8.pageObjects.DynamicButtonsSimplePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static bogdanSandu.tests.tema8.pageObjects.DynamicButtonsSimplePage.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicButtonsSimplePageTest extends BaseTest {

    @Test(groups = "Desktop")
    public void DynamicButtonsTestForDesktop(){
        System.out.println("Dynamic button test Desktop");
        DynamicButtonsSimplePage dynamicButtonsSimplePage = new DynamicButtonsSimplePage(driver);
        driver.get(START_PAGE_URL);
        System.out.println("Got to 'Simple Dynamic Buttons' link");
        dynamicButtonsSimplePage.getStartButton().click();
        System.out.println("Click on start button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_ONE)));
        dynamicButtonsSimplePage.getOneButton().click();
        System.out.println("Click on 'One' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_TWO)));
        dynamicButtonsSimplePage.getTwoButton().click();
        System.out.println("Click on 'Two' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_THREE)));
        dynamicButtonsSimplePage.getThreeButton().click();
        System.out.println("Click on 'Three' button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(MESSAGE)));
        System.out.println(dynamicButtonsSimplePage.getMessage().getText());

        assertTrue(isElementPresent(By.id(MESSAGE)),"The message was not displayed even though I pressed all the buttons");
        assertEquals(dynamicButtonsSimplePage.getMessage().getText(),"All Buttons Clicked","The corresponding message was not displayed");
    }

    @Test(groups = "Mobile")
    public void DynamicButtonsTestForMobile(){
        System.out.println("Dynamic button test Mobile");
        DynamicButtonsSimplePage dynamicButtonsSimplePage = new DynamicButtonsSimplePage(driver);
        driver.get(START_PAGE_URL);
        System.out.println("Got to 'Simple Dynamic Buttons' link");
        dynamicButtonsSimplePage.getStartButton().click();
        System.out.println("Click on start button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_ONE)));
        dynamicButtonsSimplePage.getOneButton().click();
        System.out.println("Click on 'One' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_TWO)));
        dynamicButtonsSimplePage.getTwoButton().click();
        System.out.println("Click on 'Two' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(BUTTON_THREE)));
        dynamicButtonsSimplePage.getThreeButton().click();
        System.out.println("Click on 'Three' button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(MESSAGE)));
        System.out.println(dynamicButtonsSimplePage.getMessage().getText());

        assertTrue(isElementPresent(By.id(MESSAGE)),"The message was not displayed even though I pressed all the buttons");
        assertEquals(dynamicButtonsSimplePage.getMessage().getText(),"All Buttons Clicked","The corresponding message was not displayed");
    }
}
