package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Instant;

public class RefreshPage {

    private WebDriver driver;

    public RefreshPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage() {
        driver.get("https://testpages.herokuapp.com/styled/refresh");
    }

    public String getIdText() {
        return driver.findElement(By.id("id")).getText();
    }

    public boolean isIdTimestamp() {
        long idTimestamp = Long.parseLong(getIdText());
        long currentTimestamp = Instant.now().getEpochSecond();
        long delta = currentTimestamp - idTimestamp;
        return delta <= 2;
    }

    public void get() {
    }
}
