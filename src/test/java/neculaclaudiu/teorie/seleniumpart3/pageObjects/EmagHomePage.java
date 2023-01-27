package neculaclaudiu.teorie.seleniumpart3.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmagHomePage {
    ChromeDriver driver;

    public EmagHomePage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "js-accept")
    WebElement acceptButton;

    public void clickOnAcceptButton(){
        acceptButton.click();
    }
}
