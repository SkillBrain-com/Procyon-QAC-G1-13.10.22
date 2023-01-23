package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicButtonsSimplePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public DynamicButtonsSimplePage(ChromeDriver driver) {
    }

    public void JavaScriptRedirectPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void goToPage() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
    }

    public void clickRedirectButton() {
        driver.findElements(By.id("button00"));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    public void switchToNewTab() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }
}