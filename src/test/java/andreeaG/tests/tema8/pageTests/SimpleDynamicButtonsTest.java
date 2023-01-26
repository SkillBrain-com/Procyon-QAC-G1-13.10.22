package andreeaG.tests.tema8.pageTests;

import andreeaG.tests.tema8.pageObjects.SimpleDynamicButtonsPage;
import org.testng.annotations.Test;


public class SimpleDynamicButtonsTest extends BaseTest {

    @Test
    public void verifyClickOnAllButtons() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
        SimpleDynamicButtonsPage simpleDynamicButtonsPage = new SimpleDynamicButtonsPage(driver);
        simpleDynamicButtonsPage.clickOnStartButton();
        simpleDynamicButtonsPage.clickOnOneButton();
        simpleDynamicButtonsPage.clickOnSecondButton();
        //Assert message All Buttons Clicked appear at the end
    }
}

