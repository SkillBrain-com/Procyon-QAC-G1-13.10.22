package alinatinca.tests.Tema8.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HerokuBasicAjaxExampleConfirmationPage {

    //Create the required attributes for this test case
    ChromeDriver driver;

    WebDriverWait wait;

    Wait<WebDriver> fluentWait;

    //Create the constructor that can define the required parameters for this test case
    public HerokuBasicAjaxExampleConfirmationPage(ChromeDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(1)).pollingEvery(Duration.ofMillis(200));
        PageFactory.initElements(driver, this);
    }

    //Find Category ID element from the page
    @FindBy(id = "_valueid")
    WebElement categoryParagpraphID;

    //Create a method that display the selected language id category
    public String getCategoryID(){
        return categoryParagpraphID.getText();
    }

    //Find Language Id element from the page
    @FindBy(id="_valuelanguage_id")
    WebElement categoryParagpraphLanguage;

    //Create a method that display the selected language id category
    public String getCategoryLanguage() {
        return categoryParagpraphLanguage.getText();
    }
}
