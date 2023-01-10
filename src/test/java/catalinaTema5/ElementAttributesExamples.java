package catalinaTema5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class ElementAttributesExamples {
    :ElementAttributeExample();

   }



   public static void ElementAttributeExample() {
      WebDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
      WebElement secondLink = driver.findElement(By.id("altid"));
        secondLink.click();
        System.out.println("Current url is : " + driver.getCurrentUrl());
        driver.quit();

   }
