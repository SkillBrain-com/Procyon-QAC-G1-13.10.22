package neculaclaudiu.tests.TemaIntershipAutomation.tests;

import neculaclaudiu.tests.TemaIntershipAutomation.pageObjects.GaleriaHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends BaseTest{

    @Test
    public void headerVisibility(){
        GaleriaHomePage page = new GaleriaHomePage(driver);
        Assert.assertTrue(page.checkIfTheHeaderIsVisible());
        page.scrollDown("500");
        Assert.assertTrue(page.checkIfTheHeaderIsVisible());
    }

    @Test
    public void stickyBarVisibility(){
        GaleriaHomePage page = new GaleriaHomePage(driver);
    }
}
