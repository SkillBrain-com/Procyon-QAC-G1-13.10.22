package madalinapopescu.teorie.seleniumbasics3.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {
//    from teorie selenium-basic 3
    ChromeDriver chromeDriver;
//    for teorie selenium grid
    RemoteWebDriver remoteWebDriver;

    public EmagHomePage(ChromeDriver driver) {
        this.chromeDriver = driver;
        PageFactory.initElements(driver, this);
    }
    public EmagHomePage(RemoteWebDriver driver) {
        this.remoteWebDriver = driver;
        PageFactory.initElements(driver, this);
    }
    //WebElement acceptButton = driver.findElement(By.className("js-accept"));
    @FindBy(className = "js-accept")
    WebElement acceptButton;

    public void clickOnAcceptButton(){
        acceptButton.click();
    }
}
