package alinatinca.tests.Tema8.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class DisabledDynamicButtonConfirmationPage {

    //Create the required attributes for this test case
    ChromeDriver driver;
    WebDriverWait wait;
    Wait<WebDriver> fluentWait;

    //Create the constructor that can define the required parameters for this test case
    public DisabledDynamicButtonConfirmationPage(ChromeDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(200));
        PageFactory.initElements(driver, this);
    }

    //Find the text on the page
    @FindBy(id="buttonmessage")
    WebElement text;

    //Create a method that display the text before opening all buttons
    public String displayTextBeforeClickAllButtons(){
        return text.getText();
    }

    //Create a method that display the text after opening the all buttons
    public String displayTextAfterClickAllButtons(){
        return text.getText();
    }
}