package alinatinca.tests.Tema8.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class BasicAjaxExamplePage {

    //Create the required attributes for this test case
    ChromeDriver driver;
    WebDriverWait wait;
    Wait<WebDriver> fluentWait;

    //Create the constructor that can define the required parameters for this test case
    public BasicAjaxExamplePage(ChromeDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(1))
                .pollingEvery(Duration.ofMillis(200));
        PageFactory.initElements(driver, this);
    }

    //Find the paragraph
    @FindBy(className = "explanation")
    WebElement paragraph;

    //Create a method that display the message from the first paragraph
    public String displayParagraph(){
        return paragraph.getText();
    }

    //Find Category element from the page
    @FindBy(id = "combo1")
    WebElement category;

    //FindBy Language element from the page
    @FindBy (id = "combo2")
    WebElement language;

    //Find the submit button from the page
    @FindBy(className = "styled-click-button")
    WebElement submitButton;

    //Create a method that select the one of the items from category
    public void selectCategory(String categoryName){
        Select category = new Select(this.category);
        category.selectByVisibleText(categoryName);
    }

    //Create a method that select the one of the items from language
    public void selectLanguage(String languageName){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajaxBusy")));
        fluentWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajaxBusy")));
        Select language = new Select(this.language);
        language.selectByVisibleText(languageName);
    }

    //Create a method that click on the submit button
    public void clickOnCodeInIt(){
        submitButton.click();
        System.out.println("Code In It button has been clicked!");
    }
}