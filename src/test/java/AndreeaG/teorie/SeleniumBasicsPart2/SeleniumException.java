package AndreeaG.teorie.SeleniumBasicsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teofilursan.driver.BrowserManager;

public class SeleniumException {


    public static void main(String[] args) {
        noSuchElementException();
        System.out.println( ("am exe cu succes "));

    }


    static void noSuchElementException() {

        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get ("https://testpages.herokuapp.com/styled/index.html");
        WebElement firstLink = driver.findElement(By.id("basicpagetest"));
        firstLink.click();
        driver.quit();
    }
}
