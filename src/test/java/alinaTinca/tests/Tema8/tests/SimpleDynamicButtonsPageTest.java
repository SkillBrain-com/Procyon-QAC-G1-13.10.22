package alinatinca.tests.Tema8.tests;

import alinatinca.driver.BrowserManager;
import alinatinca.tests.Tema8.pageObjects.SimpleDynamicButtonConfirmationPage;
import alinatinca.tests.Tema8.pageObjects.SimpleDynamicButtonPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleDynamicButtonsPageTest extends BaseTest{
    @Test(groups = {"mobile", "desktop"})
    public void checkClickOnAllButtons(){
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
        SimpleDynamicButtonConfirmationPage simpleDynamicButtonConfirmationPage = new SimpleDynamicButtonConfirmationPage(driver);
        Assert.assertEquals(simpleDynamicButtonConfirmationPage.displayTextBeforeClickAllButtons(), "Click all 4 buttons.");
        System.out.println("The message that appears before openening all the buttons is: " + simpleDynamicButtonConfirmationPage.displayTextBeforeClickAllButtons());
        SimpleDynamicButtonPage simpleDynamicButtonPage = new SimpleDynamicButtonPage(driver);
        simpleDynamicButtonPage.clickOnStartButton();
        simpleDynamicButtonPage.clickOnOneButton();
        simpleDynamicButtonPage.clickOnSecondButton();
        simpleDynamicButtonPage.clickOnThirdButton();
        Assert.assertEquals(simpleDynamicButtonConfirmationPage.displayTextAfterClickAllButtons(), "All Buttons Clicked");
        System.out.println("The message that appears after opening all the buttons is: " + simpleDynamicButtonConfirmationPage.displayTextAfterClickAllButtons());
        System.out.println("Check was done successfully!");
    }
}