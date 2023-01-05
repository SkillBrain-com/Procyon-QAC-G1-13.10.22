package ancaMarian.teorie.seleniumBasicsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teofilursan.driver.BrowserManager;

public class SeleniumExceptions {
    public static void main(String[] args) {
        noSuchElementException();
        System.out.println("am executat cu succes functia main");


    }

    static void noSuchElementException() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.createChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/index.html");
            WebElement firstLink = driver.findElement(By.id("baicpagetest"));
            firstLink.click();
        } catch (NoSuchElementException e) {
            System.out.println("nu s-a gasit elementul " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }

    }
}
