package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RefreshPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public RefreshPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage() {
        driver.get("https://testpages.herokuapp.com/styled/refresh.html");
    }

    public boolean isIdTimestamp() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("refreshdate")));
        return driver.findElement(By.id("refreshdate")).isDisplayed();
    }
}





