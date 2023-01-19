package ancaMarian.teorie.seleniumbasics3.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {

    ChromeDriver driver;

    public EmagHomePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //WebElement acceptButton = driver.findElement(By.className("js-accept"));
    @FindBy(className = "js-accept") //nu e metoda, e ca un atribut
    WebElement acceptButton;

    public void clickOnAcceptButton() {
        acceptButton.click();
    }
}
