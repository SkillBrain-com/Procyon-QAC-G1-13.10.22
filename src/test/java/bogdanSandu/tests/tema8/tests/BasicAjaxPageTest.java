package bogdanSandu.tests.tema8.tests;

import bogdanSandu.tests.tema8.pageObjects.BasicAjaxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static bogdanSandu.tests.tema8.pageObjects.BasicAjaxPage.START_PAGE_URL;

public class BasicAjaxPageTest extends BaseTest {

    @Test(groups = "Desktop")
    public void codeItInTestForDesktop() {
        System.out.println("Code It In test Desktop");
        int category = 1, language = 2;

        BasicAjaxPage basicAjaxPage = new BasicAjaxPage(driver);
        driver.get(START_PAGE_URL);
        System.out.println("Got to 'Basic Ajax Example' link");

        basicAjaxPage.getSelectCategory().get(category).click();
        System.out.println("Select category");

        fluentWait(driver).until(ExpectedConditions.titleIs("Test Page For Basic Ajax Example"));
        basicAjaxPage.getSelectLanguage().get(language).click();
        System.out.println("Select language");
        String languageID = String.valueOf(Integer.valueOf(basicAjaxPage.getSelectLanguage().get(language).getAttribute("value")));
        String categoryID = String.valueOf(Integer.valueOf(basicAjaxPage.getSelectCategory().get(category).getAttribute("value")));
        basicAjaxPage.getButton().click();

        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id("_valueid")));

        Assert.assertEquals(driver.getCurrentUrl(),"https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1");
        Assert.assertEquals(languageID, basicAjaxPage.getLanguageSelected().getText());
        Assert.assertEquals(categoryID, basicAjaxPage.getCategorySelected().getText());
    }

    @Test(groups = "Mobile")
    public void codeItInTestForMobile() {
        System.out.println("Code It In test Mobile");
        int category = 1, language = 2;


        driver.get(START_PAGE_URL);
        BasicAjaxPage basicAjaxPage = new BasicAjaxPage(driver);
        System.out.println("Got to 'Basic Ajax Example' link");

        basicAjaxPage.getSelectCategory().get(category).click();
        System.out.println("Select category");

        fluentWait(driver).until(ExpectedConditions.titleIs("Test Page For Basic Ajax Example"));
        basicAjaxPage.getSelectLanguage().get(language).click();
        System.out.println("Select language");

        String languageID = String.valueOf(Integer.valueOf(basicAjaxPage.getSelectLanguage().get(language).getAttribute("value")));
        String categoryID = String.valueOf(Integer.valueOf(basicAjaxPage.getSelectCategory().get(category).getAttribute("value")));
        basicAjaxPage.getButton().click();

        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id("_valueid")));

        Assert.assertEquals(driver.getCurrentUrl(),"https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1");
        Assert.assertEquals(languageID, basicAjaxPage.getLanguageSelected().getText());
        Assert.assertEquals(categoryID, basicAjaxPage.getCategorySelected().getText());
    }
}
