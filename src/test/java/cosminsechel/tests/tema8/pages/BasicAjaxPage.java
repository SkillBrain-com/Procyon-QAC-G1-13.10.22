package cosminsechel.tests.tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasicAjaxPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasicAjaxPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void goToPage() {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
    }

    public void clickCodeItInButton() {
        wait.until(ExpectedConditions.attributeToBe(By.cssSelector("body > div > div.centered > form > input.styled-click-button"), "value", "Code In It"));
        driver.findElement(By.name("submitbutton")).click();
    }


}
