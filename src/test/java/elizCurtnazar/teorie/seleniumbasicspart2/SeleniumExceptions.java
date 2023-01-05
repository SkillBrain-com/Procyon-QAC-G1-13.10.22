package elizCurtnazar.teorie.seleniumbasicspart2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teofilursan.driver.BrowserManager;

public class SeleniumExceptions {
    public static void main(String[] args) {
        noSuchElementException();

    }

    static void noSuchElementException() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.createChromeDriver();

            driver.get("https://testpages.herokuapp.com/styled/index.html");
            WebElement firstLink = driver.findElement(By.id("basicpbgetest"));
            firstLink.click();
        } catch (NoSuchElementException e) {
            System.out.println("Nu s-a gasit elementul:" + e.getMessage());
            WebElement firstLink = driver.findElement(By.id("basicpagetest"));
            firstLink.click();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}