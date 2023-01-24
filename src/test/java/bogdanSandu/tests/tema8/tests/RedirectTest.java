package bogdanSandu.tests.tema8.tests;

import bogdanSandu.tests.tema8.pageObjects.RedirectsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static bogdanSandu.tests.tema8.pageObjects.RedirectsPage.*;
import static org.testng.Assert.assertEquals;

public class RedirectTest extends BaseTest {

    @Test(groups = "Desktop")
    public void redirectButtonsTestForDesktop() {
        System.out.println("Redirect buttons test Desktop");
        String expectedURL = "https://testpages.herokuapp.com/styled/redirected.html";
        RedirectsPage redirectsPage = new RedirectsPage(driver);
        driver.get(START_PAGE_URL);
        System.out.println("Got to 'JavaScript Redirects' link");
        redirectsPage.getDelayBasic().click();
        System.out.println("Click on delay basic button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(BACK_BUTTON)));
        assertEquals(expectedURL, driver.getCurrentUrl(),"Not redirected to the correct page after pressing the delay basic button");
        redirectsPage.getBackButton().click();
        System.out.println("Click on back button");

        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(DELAY_BOUNCE)));
        redirectsPage.getDelayBounceButton().click();
        System.out.println("Click on delay bounce button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(BACK_BUTTON)));
        assertEquals(expectedURL, driver.getCurrentUrl(),"Not redirected to the correct page after pressing the delay bounce button");
        redirectsPage.getBackButton().click();
        System.out.println("Click on back button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(DELAY_BASIC)));
        assertEquals(START_PAGE_URL,driver.getCurrentUrl(),"Not redirect to the home page after pressing the back button");
    }

    @Test(groups = "Mobile")
    public void redirectButtonsTestForMobile() {
        System.out.println("Redirect buttons test Mobile");
        RedirectsPage redirectsPage = new RedirectsPage(driver);
        String expectedURL = "https://testpages.herokuapp.com/styled/redirected.html";
        driver.get(START_PAGE_URL);
        System.out.println("Got to 'JavaScript Redirects' link");
        redirectsPage.getDelayBasic().click();
        System.out.println("Click on delay basic button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(BACK_BUTTON)));
        assertEquals(expectedURL, driver.getCurrentUrl(),"Not redirected to the correct page after pressing the delay basic button");
        redirectsPage.getBackButton().click();
        System.out.println("Click on back button");

        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(DELAY_BOUNCE)));
        redirectsPage.getDelayBounceButton().click();
        System.out.println("Click on delay bounce button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(BACK_BUTTON)));
        assertEquals(expectedURL, driver.getCurrentUrl(),"Not redirected to the correct page after pressing the delay bounce button");

        redirectsPage.getBackButton().click();
        System.out.println("Click on back button");
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(DELAY_BASIC)));
        assertEquals(START_PAGE_URL,driver.getCurrentUrl(),"Not redirect to the home page after pressing the back button");
    }
}
