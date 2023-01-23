package bogdanSandu.tests.Tema8.Tests;

import bogdanSandu.tests.Tema8.PageObjects.DynamicButtonsSimplePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static bogdanSandu.tests.Tema8.PageObjects.DynamicButtonsSimplePage.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicButtonsSimplePageTest extends BaseTest {

    @Test(groups = "Desktop")
    public void DynamicButtonsTestForDesktop(){
        System.out.println("Dynamic button test Desktop");
        DynamicButtonsSimplePage dynamicButtonsSimplePage = new DynamicButtonsSimplePage(driver);
        driver.get(StartPage);
        System.out.println("Got to 'Simple Dynamic Buttons' link");
        dynamicButtonsSimplePage.getStartButton().click();
        System.out.println("Click on start button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(ButtonOne)));
        dynamicButtonsSimplePage.getOneButton().click();
        System.out.println("Click on 'One' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(ButtonTwo)));
        dynamicButtonsSimplePage.getTwoButton().click();
        System.out.println("Click on 'Two' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(ButtonThree)));
        dynamicButtonsSimplePage.getThreeButton().click();
        System.out.println("Click on 'Three' button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(Message)));
        System.out.println(dynamicButtonsSimplePage.getMessage().getText());

        assertTrue(isElementPresent(By.id(Message)),"The message was not displayed even though I pressed all the buttons");
        assertEquals(dynamicButtonsSimplePage.getMessage().getText(),"All Buttons Clicked","The corresponding message was not displayed");
    }

    @Test(groups = "Mobile")
    public void DynamicButtonsTestForMobile(){
        System.out.println("Dynamic button test Mobile");
        DynamicButtonsSimplePage dynamicButtonsSimplePage = new DynamicButtonsSimplePage(driver);
        driver.get(StartPage);
        System.out.println("Got to 'Simple Dynamic Buttons' link");
        dynamicButtonsSimplePage.getStartButton().click();
        System.out.println("Click on start button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(ButtonOne)));
        dynamicButtonsSimplePage.getOneButton().click();
        System.out.println("Click on 'One' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(ButtonTwo)));
        dynamicButtonsSimplePage.getTwoButton().click();
        System.out.println("Click on 'Two' button");
        fluentWait(driver).until(ExpectedConditions.elementToBeClickable(By.id(ButtonThree)));
        dynamicButtonsSimplePage.getThreeButton().click();
        System.out.println("Click on 'Three' button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(Message)));
        System.out.println(dynamicButtonsSimplePage.getMessage().getText());

        assertTrue(isElementPresent(By.id(Message)),"The message was not displayed even though I pressed all the buttons");
        assertEquals(dynamicButtonsSimplePage.getMessage().getText(),"All Buttons Clicked","The corresponding message was not displayed");
    }
}
