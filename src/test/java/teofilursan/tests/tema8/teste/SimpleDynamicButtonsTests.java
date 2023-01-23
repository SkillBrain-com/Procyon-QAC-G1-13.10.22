package teofilursan.tests.tema8.teste;

import org.testng.Assert;
import org.testng.annotations.Test;
import teofilursan.tests.tema8.pageobjects.BasicAjaxConfirmationPage;
import teofilursan.tests.tema8.pageobjects.BasicAjaxPage;
import teofilursan.tests.tema8.pageobjects.SimpleDynamicButtonsPage;

public class SimpleDynamicButtonsTests extends BaseTest {

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
