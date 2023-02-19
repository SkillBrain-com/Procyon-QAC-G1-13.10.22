package elizCurtnazar.tests.tema8.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class BasicAjaxPage {

    ChromeDriver driver;
    WebDriverWait wait;
    Wait<WebDriver> fluentWait;

    //constructorul clasei
    public BasicAjaxPage(ChromeDriver driver) {
        this.driver = driver;
        //using WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //using FluentWait
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(1))
                .pollingEvery(Duration.ofMillis(200));
        PageFactory.initElements(driver, this);  //initilizeaza elementuș
    }

    @FindBy(id = "combo1")
    WebElement category;

    @FindBy(id = "combo2")
    WebElement language;

    @FindBy(name = "submitbutton")
    WebElement submitButton;


    //metodele
    public void selectCategory(String categoryName) {
        Select category = new Select(this.category); //initializam obiectul select, trimitem un webelemet ca parametru
        category.selectByVisibleText(categoryName);//this.category facem referinta obiectului definit in findby
                                                    // category de la select.category este o variabila de la obiectul select
    }
    public void selectLanguage(String languageName) {
        //use either first option with WebDriverWait
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajaxBusy")));//expectedconditions/waitsaseincarcepagina/waitsaseincarcescriptu
        //or second option with FluentWait
        fluentWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajaxBusy")));
        Select language = new Select(this.language);
        language.selectByVisibleText(languageName);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }
}