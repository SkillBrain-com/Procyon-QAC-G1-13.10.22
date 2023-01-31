package andreeaG.tests.tema8.pageTests;

import andreeaG.tests.tema8.pageObjects.RefreshPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RefreshPageTest extends BaseTest {

    @Test(groups = {"mobile", "desktop"})
    public void refreshPageTest() {
        driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/refresh");
        RefreshPage refreshPage = new RefreshPage(driver);
        String firstTimestamp = refreshPage.firstTimestamp();
        driver.navigate().refresh();
        String afterRefreshTimestamp = refreshPage.firstTimestamp();
        Assert.assertNotEquals(firstTimestamp, afterRefreshTimestamp, "Timestamps are same after refresh");
    }
}
