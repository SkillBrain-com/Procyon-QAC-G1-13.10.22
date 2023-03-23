package AdelaCiobanu.test.Tema9.Tema8.Teste;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleDynamicButtonsTests extends BaseTest {

    @Test(groups = {"mobile", "desktop"})
    public void verifyClickOnAllButtons() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
        SimpleDynamicButtonsPage simpleDynamicButtonsPage = new SimpleDynamicButtonsPage(driver);
        simpleDynamicButtonsPage.clickOnStartButton();
        simpleDynamicButtonsPage.clickOnOneButton();
        simpleDynamicButtonsPage.clickOnSecondButton();
        simpleDynamicButtonsPage.clickOnThirdButton();
        Assert.assertEquals(simpleDynamicButtonsPage.confirmationMessage(), "All Buttons Clicked", "Not all buttons were clicekd.");
    }
}

