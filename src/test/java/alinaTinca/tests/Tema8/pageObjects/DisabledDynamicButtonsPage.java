package alinatinca.tests.Tema8.pageObjects;

import org.openqa.selenium.By;
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

public class DisabledDynamicButtonsPage {

    ChromeDriver driver;
    WebDriverWait wait;
    Wait<WebDriver> fluentWait;

    public DisabledDynamicButtonsPage(ChromeDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(200));
        PageFactory.initElements(driver, this);
    }

    //Find the start button
    @FindBy (id="button00")
    WebElement startButton;

    //Create a method that click on start button
    public void clickOnStartButton(){
        startButton.click();
        System.out.println("Start button has been opened!");
    }

    //Find the one button
    @FindBy(id="button01")
    WebElement oneButton;

    //Create a method that click on the one button
    public void clickOnOneButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button01")));
        System.out.println("Condition has been executed!");
        oneButton.click();
        System.out.println("One button has been opened!");
    }

    //Find the second button

}
