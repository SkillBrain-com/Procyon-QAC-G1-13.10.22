package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicButtonsDisabledPage {

    private WebDriver driver;

    public DynamicButtonsDisabledPage(WebDriver driver) {
        this.driver = driver;
    }

    public void get() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
    }

    public void clickAllButtons() {
        driver.findElements(By.className("dynamic-button-disabled")).forEach(button -> button.click());
    }

    public String getDisplayedMessage() {
        return driver.findElement(By.id("message")).getText();
    }
}

