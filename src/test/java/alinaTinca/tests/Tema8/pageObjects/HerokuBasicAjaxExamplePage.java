package alinatinca.tests.Tema8.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.awt.*;
import java.time.Duration;

public class HerokuBasicAjaxExamplePage {

//0. Creezi atributele:
    ChromeDriver driver;

    WebDriverWait wait;

    Wait<WebDriver> fluentWait;

//1. Creezi constructorul
    public HerokuBasicAjaxExamplePage(ChromeDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(1))
                        .pollingEvery(Duration.ofMillis(200));
        PageFactory.initElements(driver, this); //identifica elementele pe pagina
    }


//2. Identificam elementele de pe pagina cu FindBy

    //pentru Categoriile de selectat
    @FindBy(id = "combo1")
    WebElement category;


    //FindBy pt Language
    @FindBy (id = "combo2")
    WebElement language;

    //pentru butonul CODEINIT
    @FindBy(className = "styled-click-button")
    WebElement codeInItButton;


    //2. Definim metodele
    public void selectCategory(String categoryName){
        Select category = new Select(this.category);
        category.selectByVisibleText(categoryName);
    }

    public void selectLanguage(String languageName){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajaxBusy")));
        fluentWait.until(ExpectedCondition.invisibilityOfElementLocated(By.id("ajaxBusy")));
        Select language = new Select(this.language);
        language.selectByVisibleText(languageName);
    }

    public void clickOnCodeInIt(){
        codeInItButton.click();
        System.out.println("Code In It button has been clicked!");
    }

}

