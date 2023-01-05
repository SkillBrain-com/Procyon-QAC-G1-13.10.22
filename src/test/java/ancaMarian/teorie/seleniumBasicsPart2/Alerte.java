package ancaMarian.teorie.seleniumBasicsPart2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import teofilursan.driver.BrowserManager;
import teofilursan.driver.BrowserManager;

public class Alerte {
    public static void main(String[] args) {
        openAndSubmitAlert();

    }

    static void openAndSubmitAlert() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.createChromeDriver();
            driver.get("https://demoqa.com/alerts");
            WebElement thirdAlertButton = driver.findElement(By.id("confirmButton"));
            thirdAlertButton.click();
            Thread.sleep(2000);
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();//sau dismiss();

        } catch (Exception e) {
            System.out.println("am intrat in catch");
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}

