package ancaMarian.tests.tema8.tests;

import ancaMarian.tests.tema8.pageObjects.RefreshPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RefreshPageTest extends BaseTest{

    @Test
    public void refreshPageTest() {
        driver.get("https://testpages.herokuapp.com/styled/refresh");
        RefreshPage refreshPage = new RefreshPage(driver);
        refreshPage.waitForIdToBeVisible();
        String timestampBeforeRefresh = refreshPage.getTimestamp();
        driver.navigate().refresh();
        String timestampAfterRefresh = refreshPage.getTimestamp();
        Assert.assertNotEquals(timestampAfterRefresh, timestampBeforeRefresh, "Timestamp did not change after refresh.");
    }
}
