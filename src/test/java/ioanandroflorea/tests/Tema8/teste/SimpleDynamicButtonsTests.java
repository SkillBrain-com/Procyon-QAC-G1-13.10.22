package ioanandroflorea.tests.Tema8.teste;

import org.testng.Assert;
import org.testng.annotations.Test;
import ioanandroflorea.tests.Tema8.pageObjects.BasicAjaxConfirmationPage;
import ioanandroflorea.tests.Tema8.pageObjects.BasicAjaxPage;
import ioanandroflorea.tests.Tema8.pageObjects.SimpleDynamicButtonsPage;

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
