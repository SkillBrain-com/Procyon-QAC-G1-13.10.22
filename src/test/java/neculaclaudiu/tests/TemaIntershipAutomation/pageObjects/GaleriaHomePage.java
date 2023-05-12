package neculaclaudiu.tests.TemaIntershipAutomation.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GaleriaHomePage {
    ChromeDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    public GaleriaHomePage(ChromeDriver driver){
        this.driver = driver;
        this.driver.get("https://pl-galeria-warminska-uat.azurewebsites.net/en");
        js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public boolean checkIfTheHeaderIsVisible(){
        return header.isDisplayed();
    }

    public void scrollDown(String pixels){
        js.executeScript("window.scrollBy(0, "+pixels+");");
    }
    @FindBy(css = "header.relative")
    WebElement header;

}
