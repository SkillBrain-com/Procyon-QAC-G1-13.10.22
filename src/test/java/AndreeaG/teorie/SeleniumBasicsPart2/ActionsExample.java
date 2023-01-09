package AndreeaG.teorie.SeleniumBasicsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import teofilursan.driver.BrowserManager;

public class ActionsExample {
    public static void main(String[] args) {
        doubleClickOnElement();

    }

    static void doubleClickOnElement() {
        ChromeDriver driver = null;

        try {
            driver = BrowserManager.createChromeDriver();
            driver.get("https://demoqa.com/buttons");
            WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
            Actions actions = new Actions(driver);
            actions.doubleClick(doubleClickButton).build().perform();
        }catch (Exception e) {



        }

    }
}
