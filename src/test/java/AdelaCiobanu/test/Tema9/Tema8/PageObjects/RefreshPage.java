package AdelaCiobanu.test.Tema9.Tema8.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RefreshPage {
    RemoteWebDriver driver;
    WebDriverWait wait;

    public RefreshPage(RemoteWebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="refreshdate")
    WebElement refreshButton;
    public String getTimestamp(){
        return refreshButton.getText();
    }
}

