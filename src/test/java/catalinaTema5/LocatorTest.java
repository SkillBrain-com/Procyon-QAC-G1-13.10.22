package catalinaTema5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


     public class  LocatorTest {

         public static void main(String[] args) {
         LocatorTest();
    }



        public static void LocatorTest() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");

        WebElement firstPharagraph = driver.findElement(By.className("explanation"));
        System.out.println("Primul pharagraf are textul:" + firstPharagraph.getText());
        driver.quit();

    }
}


