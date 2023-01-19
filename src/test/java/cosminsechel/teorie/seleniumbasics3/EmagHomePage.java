package cosminsechel.teorie.seleniumbasics3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class EmagHomePage {

    ChromeDriver driver;
    public EmagHomePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "js-accept")
    WebElement acceptButton;

    public void clickOnAcceptButton() {
        acceptButton.click();
    }

}
