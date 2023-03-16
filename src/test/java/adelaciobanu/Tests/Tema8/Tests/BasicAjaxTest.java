package adelaciobanu.Tests.Tema8.Tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAjaxTest extands BaseTest{

    @Test(groups = {"mobile", "desktop"})
    public void codeItInTest(){
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        BasicAjaxPage basicAjaxPage = new BasicAjaxPage(driver);
        basicAjaxPage.selectCategory("Desktop");
        basicAjaxPage.selectLanguage("Assembler");
        basicAjaxPage.clickOnSubmitButton();
        BasicAjaxConfirmationPage basicAjaxConfirmationPage = new BasicAjaxConfirmationPage(driver);
        Assert.assertEquals(basicAjaxConfirmationPage.getCategoryText(),"2");
        Assert.assertEquals(basicAjaxConfirmationPage.getLanguageText(),"11");
        Assert.assertEquals(basicAjaxConfirmationPage.getsubmitButtonText(),"Code In It");
    }
}

