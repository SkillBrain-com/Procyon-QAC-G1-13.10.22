package neculaclaudiu.tests.seleniumpart3.tests;

import neculaclaudiu.tests.seleniumpart3.pageObjects.BasicAjaxPage;
import neculaclaudiu.tests.seleniumpart3.pageObjects.BasicAjaxVerificationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAjaxPageTest extends BaseTest{

    @Test
    public void ajaxPageTest(){
        BasicAjaxPage page = new BasicAjaxPage(driver);
        page.selectCategory("Desktop");
        page.selectLanguage("Visual Basic");
        page.clickOnCodeInButton();
        BasicAjaxVerificationPage verificationPage = new BasicAjaxVerificationPage(driver);
        Assert.assertEquals(verificationPage.getCategoryText(),"2");
        Assert.assertEquals(verificationPage.getLanguageText(),"13");
    }
}
