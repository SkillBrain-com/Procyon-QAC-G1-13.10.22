package alinatinca.tests.Tema8.tests;

import alinatinca.driver.BrowserManager;
import alinatinca.tests.Tema8.pageObjects.RefreshPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RefreshPageTest extends BaseTest{
    @Test(groups = {"mobile", "desktop"})
    public void refreshPage(){
        driver.get("https://testpages.herokuapp.com/styled/refresh");
        System.out.println("Refresh Test Page has been opened!");
        RefreshPage refreshPage = new RefreshPage(driver);
        System.out.println("Timestamp before regreshing is: " + refreshPage.getStatusForTimestamp());
        driver.navigate().refresh();
        System.out.println("The page has been refreshed!");
        System.out.println("Timestamp after refreshing is: " + refreshPage.getStatusForTimestamp());
        Assert.assertEquals(refreshPage.getStatusForTimestamp(), refreshPage.getStatusForTimestamp(), "Timestamp has been changed!");
        System.out.println("Check was done successfully!");
    }
}