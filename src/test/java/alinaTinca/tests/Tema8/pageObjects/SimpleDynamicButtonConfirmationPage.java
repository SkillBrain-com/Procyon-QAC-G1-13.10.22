package alinatinca.tests.Tema8.pageObjects;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SimpleDynamicButtonConfirmationPage {

    //Create the required attributes for this test case
    ChromeDriver driver;
    WebDriverWait wait;

    //Create the constructor that can define the required parameters for this test case
    public SimpleDynamicButtonConfirmationPage(ChromeDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    //Find the text on the page
    @FindBy(id ="buttonmessage")
    WebElement text;

    //Create a method that display the message for opening all the buttons
    public String displayTextForClickAllButtons() {
        return text.getText();
    }
}