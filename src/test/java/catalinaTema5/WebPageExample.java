package catalinaTema5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageExample {
    public static void main(String[] args) {
        WebPageTest();
    }

    public static void WebPageTest() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement attributeButton = driver.findElement(By.className("styled-click-button"));
        attributeButton.click();
        WebElement firstLink = driver.findElement(By.id("basicpagetest"));
        System.out.println( firstLink.getText());
        firstLink.click();
        WebElement lastParagraph = driver.findElement(By.className("sub"));
        System.out.println( lastParagraph.getText());
        driver.quit();
    }


}