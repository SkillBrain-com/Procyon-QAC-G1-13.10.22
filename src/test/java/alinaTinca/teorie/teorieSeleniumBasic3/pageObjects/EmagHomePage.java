package alinatinca.teorie.teorieSeleniumBasic3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {
//incercarile pe care le facem pe home page

    //pentru partea de teorie tema 8
    ChromeDriver driver;


    //pt partea de RemoteWebDriver - 26.01.2023
    RemoteWebDriver remoteWebDriver;

    public EmagHomePage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public EmagHomePage(RemoteWebDriver driver){
        this.remoteWebDriver = driver;
        PageFactory.initElements(driver, this);
    }


    //WebElement acceptButton = driver.findElement(By.className("js-accept"));
    @FindBy(className = "js-accept")
    WebElement acceptButton;


    public void clickOnAcceptButton() {
        acceptButton.click();
    }
}
