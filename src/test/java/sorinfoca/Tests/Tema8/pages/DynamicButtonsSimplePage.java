package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicButtonsSimplePage {

    private WebDriver driver;

    public DynamicButtonsSimplePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
    }

    public void clickAllButtons() {
        driver.findElements(By.className("dynamic-button")).forEach(button -> button.click());
    }

    public String getDisplayedMessage() {
        return driver.findElement(By.id("message")).getText();
    }

}
