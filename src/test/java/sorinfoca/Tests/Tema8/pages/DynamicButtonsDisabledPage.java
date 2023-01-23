package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicButtonsDisabledPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public DynamicButtonsDisabledPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void goToPage() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
    }

    public void clickAllButtons() {
        driver.findElements(By.className("dynamic-button-disabled")).forEach(button -> button.click());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
    }

    public String getDisplayedMessage() {
        return driver.findElement(By.id("message")).getText();
    }
}

