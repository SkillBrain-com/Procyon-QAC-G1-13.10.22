package alinaTinca.teorie.seleniumbasicpart2;

import AlinaTinca.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

    public static void main(String[] args) {
        doubleClickOnElement();
    }

    public static void doubleClickOnElement(){   //se fol pt interactiuni mai speciale
        ChromeDriver driver = null;
        try{
            driver = BrowserManager.createChromeDriver();
            driver.get("https://demoqa.com/buttons");
            WebElement doubleClikButton = driver.findElement(By.id("doubleClickBtn"));
            Actions actions = new Actions (driver);
            actions.doubleClick(doubleClikButton).build().perform();
        } catch (Exception e) {
            System.out.println("Am intrat in catch");
        } finally {
            if (driver != null){
                driver.quit();
            }
        }
    }
}
