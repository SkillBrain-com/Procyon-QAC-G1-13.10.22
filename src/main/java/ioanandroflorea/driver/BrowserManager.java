<<<<<<<< HEAD:src/main/java/alinatinca/BrowserManager.java
package alinatinca;
========
package ioanandroflorea.driver;
>>>>>>>> main:src/main/java/ioanandroflorea/driver/BrowserManager.java

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {

    public static ChromeDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    public static void closeBrowser(ChromeDriver driver) {
        driver.quit();
    }
}
