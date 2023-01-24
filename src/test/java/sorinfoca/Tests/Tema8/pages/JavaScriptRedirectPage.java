package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptRedirectPage {

    private WebDriver driver;

    private WebDriverWait wait;

    public JavaScriptRedirectPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void goToPage() {
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
    }

    public void clickRedirectButton(int index) {
        driver.findElements(By.id("delaygotobasic")).get(index).click();
    }
}
