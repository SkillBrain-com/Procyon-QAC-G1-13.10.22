package catalinaTema5.Heroku;

import catalinaTema5.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


     public class  LocatorTest {

        
       public static void LocatorTest() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");

        WebElement firstPharagraph = driver.findElement(By.className("explanation"));
        System.out.println("Primul pharagraf are textul:" + firstPharagraph.getText());
        WebElement indexButton = driver.findElement(By.xPath("/html/body/div[1]/div[1]/a"));
        indexButton.get.click;
        driver.quit();

    }
}


