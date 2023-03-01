package catalinazoldi.teorie.SBpart3.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {

    public ChromeDriver chromeDriver;
    ChromeDriver driver;


    public  EmagHomePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //WebElement acceptButton = driver.findElement(By.className("js-accept"));
    @FindBy(className = "js-accept")
    WebElement acceptButton;
    public void clickOnAcceptButton() {
        acceptButton.click();
    }
}



