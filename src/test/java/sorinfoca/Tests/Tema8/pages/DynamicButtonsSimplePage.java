package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicButtonsSimplePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public DynamicButtonsSimplePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void goToPage() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
    }

    public void selectAllButtons() {
        driver.findElement(By.id("button00")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("button01")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("button02")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("button03")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("waitmessage")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buttonmessage")));
    }

    public String getSelectedOptions() {
        WebElement message = driver.findElement(By.id("buttonmessage"));
        return message.getText();
    }
}
