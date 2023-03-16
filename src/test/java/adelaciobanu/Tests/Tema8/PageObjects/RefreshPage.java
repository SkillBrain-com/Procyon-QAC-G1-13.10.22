package adelaciobanu.Tests.Tema8.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RefreshPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public RefreshPage(ChromeDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "refreshdate")
    WebElement refreshButton;
    public String getStatusForTimestamp() {
        return refreshButton.getText();
    }
}

