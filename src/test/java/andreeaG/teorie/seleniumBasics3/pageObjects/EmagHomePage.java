package andreeaG.teorie.seleniumBasics3.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {
    // from Teorie Selen basisc 3
    ChromeDriver chromeDriver;
    public EmagHomePage(ChromeDriver driver) {
        this.chromeDriver = driver;
        PageFactory.initElements(driver, this);
    }

    //for selenium Grid
    RemoteWebDriver remoteWebDriver;
    public EmagHomePage(RemoteWebDriver driver) {
        this.remoteWebDriver = driver;
        PageFactory.initElements(driver, this);
    }

     //WebElement acceptButton =driver.findElement(By.className("js-accept"));
    @FindBy(className = "js-accept")
    WebElement acceptButton;

    public void clickOnAcceptButton(){
        acceptButton.click();
    }
}
