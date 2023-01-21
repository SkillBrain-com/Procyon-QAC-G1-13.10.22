package sorinfoca.Tests.Tema8.TestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sorinfoca.Tests.Tema8.pages.*;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestPages {
    private static WebDriver driver;
    private static WebDriverWait wait;

    private ChromeOptions mobileEmulation() {
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Nexus 5");
        ChromeOptions mobileOptions = new ChromeOptions();
        mobileOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        return mobileOptions;
    }

    private ChromeOptions desktopEmulation() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return options;
    }

    @Test(groups = "desktop")
    public void testBasicAjax() {
        BasicAjaxPage basicAjaxPage = new BasicAjaxPage(driver);
        basicAjaxPage.get();
        basicAjaxPage.selectOption("Option 2");
        basicAjaxPage.clickCodeItInButton();
        assertTrue(basicAjaxPage.isOptionSelected("Option 2"));
    }

    @Test(groups = "desktop")
    public void testJavaScriptRedirect() {
        JavaScriptRedirectPage javascriptRedirectPage = new JavaScriptRedirectPage(driver);
        javascriptRedirectPage.get();
        javascriptRedirectPage.clickRedirectButton(0);
        javascriptRedirectPage.switchToNewTab();
        driver.close();
    }

    @Test(groups = "desktop")
    public void testRefresh() {
        RefreshPage refreshPage = new RefreshPage(driver);
        refreshPage.get();
        assertTrue(refreshPage.isIdTimestamp());
    }

    @Test(groups = "desktop")
    public void testDynamicButtonsSimple() {
        DynamicButtonsSimplePage dynamicButtonsSimplePage = new DynamicButtonsSimplePage(driver);
        dynamicButtonsSimplePage.get();
        dynamicButtonsSimplePage.clickAllButtons();
        assertEquals(dynamicButtonsSimplePage.getDisplayedMessage(), "All buttons have been clicked!");
    }

    @Test(groups = "desktop")
    public void testDynamicButtonsDisabled() {
        DynamicButtonsDisabledPage dynamicButtonsDisabledPage = new DynamicButtonsDisabledPage(driver);
        dynamicButtonsDisabledPage.get();
        dynamicButtonsDisabledPage.clickAllButtons();
        assertEquals(dynamicButtonsDisabledPage.getDisplayedMessage(), "All buttons have been clicked!");
    }
}

