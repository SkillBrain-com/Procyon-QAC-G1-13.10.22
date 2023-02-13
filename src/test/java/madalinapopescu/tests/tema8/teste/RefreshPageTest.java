package madalinapopescu.tests.tema8.teste;

import madalinapopescu.tests.tema8.pageobjects.RefreshPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RefreshPageTest extends BaseTest {
    @Test
    public void refreshTest() {
        driver.get("https://testpages.herokuapp.com/styled/refresh");
        RefreshPage refreshPage = new RefreshPage(driver);
        driver.navigate().refresh();
        System.out.println("The page has been refreshed!");
        Assert.assertEquals(refreshPage.getStatusForTimestamp(), refreshPage.getStatusForTimestamp(), "Timestamp has been changed!");
    }
}



