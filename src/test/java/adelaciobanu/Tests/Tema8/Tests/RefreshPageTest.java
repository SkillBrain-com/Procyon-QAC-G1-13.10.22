package adelaciobanu.Tests.Tema8.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RefreshPageTest extends BaseTest {
    @Test(groups = {"mobile", "desktop"})
    public void refreshTest() {
        driver.get("https://testpages.herokuapp.com/styled/refresh");
        RefreshPage refreshPage = new RefreshPage(driver);
        driver.navigate().refresh();
        Assert.assertEquals(refreshPage.getStatusForTimestamp(), refreshPage.getStatusForTimestamp(), "Timestamp has been changed!");
    }
}
