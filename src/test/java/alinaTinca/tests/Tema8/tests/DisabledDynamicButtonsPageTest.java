package alinatinca.tests.Tema8.tests;

import alinatinca.driver.BrowserManager;
import alinatinca.tests.Tema8.pageObjects.DisabledDynamicButtonConfirmationPage;
import alinatinca.tests.Tema8.pageObjects.DisabledDynamicButtonsPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisabledDynamicButtonsPageTest {

    ChromeDriver driver;

    @Test
    public void clickOnAllButtons(){
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
        DisabledDynamicButtonConfirmationPage disabledDynamicButtonConfirmationPage = new DisabledDynamicButtonConfirmationPage(driver);
        disabledDynamicButtonConfirmationPage.displayTextBeforeClickAllButtons();
        DisabledDynamicButtonsPage disabledDynamicButtonsPage = new DisabledDynamicButtonsPage(driver);
        disabledDynamicButtonsPage.clickOnStartButton();
    }
}
