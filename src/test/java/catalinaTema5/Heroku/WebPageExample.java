package catalinaTema5.Heroku;

import catalinaTema5.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageExample {
    public static void main(String[] args) {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");


        WebElement firstLink = driver.findElement(By.id("stylesheet"));
        System.out.println( "First Link is:" + firstLink.getText());
        firstLink.click();
        WebElement firstText = driver.findElement(By.className("explanation"));
        System.out.println("First text:" + firstText.getText());
        WebElement middleParagraph = driver.findElement(By.id("para1"));
        System.out.println("Paragraph is:" + middleParagraph.getText());
        WebElement anotherParagraph = driver.findElement(By.id("para2"));
        System.out.println("Another paragraph is:" + anotherParagraph.getText());
        WebElement indexButton = driver.findElement(By.className("index.html"));
        indexButton.click();

        driver.quit();
    }
 }


