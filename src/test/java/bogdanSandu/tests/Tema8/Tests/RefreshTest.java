package bogdanSandu.tests.Tema8.Tests;

import bogdanSandu.tests.Tema8.PageObjects.RefreshPage;
import org.testng.annotations.Test;

import static bogdanSandu.tests.Tema8.PageObjects.RefreshPage.StartPage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class RefreshTest extends BaseTest{

    @Test(groups = "Desktop")
    public void refreshTestForDesktop() throws InterruptedException {
        System.out.println("Refresh test Desktop");
        int nr1, nr2, nr3;

        driver.get(StartPage);
        System.out.println("Got to 'Refresh Page Test' link");
        RefreshPage refreshPage = new RefreshPage(driver);

        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        nr1 = Integer.parseInt(refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Refresh no. 1");
        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        nr2= Integer.parseInt(refreshPage.getRefreshDateValue().getText());
        assertNotEquals(nr1,nr2);
        assertEquals(refreshPage.getRefreshDate().getText(), refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Refresh no. 2");
        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        nr3= Integer.parseInt(refreshPage.getRefreshDateValue().getText());
        assertNotEquals(nr2,nr3);
        assertEquals(refreshPage.getRefreshDate().getText(), refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Refresh no. 3");
        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
    }

    @Test(groups = "Mobile")
    public void refreshTestForMobile() throws InterruptedException {
        System.out.println("Refresh test Mobile");
        int nr1, nr2, nr3;

        driver.get(StartPage);
        System.out.println("Got to 'Refresh Page Test' link");
        RefreshPage refreshPage = new RefreshPage(driver);

        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        nr1 = Integer.parseInt(refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Refresh no. 1");
        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        nr2= Integer.parseInt(refreshPage.getRefreshDateValue().getText());
        assertNotEquals(nr1,nr2);
        assertEquals(refreshPage.getRefreshDate().getText(), refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Refresh no. 2");
        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
        nr3= Integer.parseInt(refreshPage.getRefreshDateValue().getText());
        assertNotEquals(nr2,nr3);
        assertEquals(refreshPage.getRefreshDate().getText(), refreshPage.getRefreshDateValue().getText());

        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Refresh no. 3");
        System.out.println(refreshPage.getRefreshDate().getText());
        System.out.println(refreshPage.getRefreshDateValue().getText());
    }
}
