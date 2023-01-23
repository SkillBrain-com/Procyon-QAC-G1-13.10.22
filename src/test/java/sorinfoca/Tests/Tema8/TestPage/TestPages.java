package sorinfoca.Tests.Tema8.TestPage;

import org.testng.annotations.Test;
import sorinfoca.Tests.Tema8.pages.*;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestPages extends BaseTest {

    @Test(groups = {"desktop", "mobile"})
    public void testBasicAjaxPage() {
        BasicAjaxPage basicAjaxPage = new BasicAjaxPage(driver);
        basicAjaxPage.goToPage();
        basicAjaxPage.selectOption("Server");
        basicAjaxPage.clickCodeItInButton();
        assertTrue(basicAjaxPage.isOptionSelected("Java"));
    }

    @Test(groups = {"desktop", "mobile"})
    public void JavaScriptRedirectPage() {
        JavaScriptRedirectPage javascriptRedirectPage = new JavaScriptRedirectPage(driver);
        javascriptRedirectPage.goToPage();
        javascriptRedirectPage.clickRedirectButton(0);
        javascriptRedirectPage.switchToNewTab();
        driver.close();
    }

    @Test(groups = {"desktop", "mobile"})
    public void RefreshPage() {
        RefreshPage refreshPage = new RefreshPage(driver);
        refreshPage.goToPage();
        assertTrue(refreshPage.isIdTimestamp());
    }

    @Test(groups = {"desktop", "mobile"})
    public void DynamicButtonsSimplePage() {
        DynamicButtonsSimplePage dynamicButtonsSimplePage = new DynamicButtonsSimplePage(driver);
        dynamicButtonsSimplePage.goToPage();
        dynamicButtonsSimplePage.clickRedirectButton();
        assertEquals(dynamicButtonsSimplePage.getDisplayedMessage(), "All buttons have been clicked!");
    }

    @Test(groups = {"desktop", "mobile"})
    public void DynamicButtonsDisabledPage() {
        DynamicButtonsDisabledPage dynamicButtonsDisabledPage = new DynamicButtonsDisabledPage(driver);
        dynamicButtonsDisabledPage.goToPage();
        dynamicButtonsDisabledPage.clickAllButtons();
        assertEquals(dynamicButtonsDisabledPage.getDisplayedMessage(), "All buttons have been clicked!");
    }
}

