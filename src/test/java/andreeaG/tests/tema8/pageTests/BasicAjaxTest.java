package andreeaG.tests.tema8.pageTests;

import andreeaG.tests.tema8.pageObjects.BasicAjaxPage;
import org.testng.annotations.Test;

public class BasicAjaxTest extends BaseTest {


    @Test
    public void codeItInTest() {
        BasicAjaxPage basicAjaxPage = new BasicAjaxPage(driver);
        basicAjaxPage.selectCategory("Desktop");
        basicAjaxPage.selectLanguage("Assembler");
        basicAjaxPage.clickOnSubmitButton();


    }
}
