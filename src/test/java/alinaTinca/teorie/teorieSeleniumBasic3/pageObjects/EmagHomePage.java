package alinaTinca.teorie.teorieSeleniumBasic3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {
//incercarile pe care le facem pe home page
    ChromeDriver driver;

    //6
    public EmagHomePage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //7
    //WebElement acceptButton = driver.findElement(By.className("js-accept"));
    @FindBy(className = "js-accept")
    WebElement acceptButton;

    //8
    public void  clickOnAcceptButton() {
        acceptButton.click();
    }
}
