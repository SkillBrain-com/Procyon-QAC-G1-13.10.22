<<<<<<<< HEAD:src/main/java/alinatinca/BrowserManager.java
package alinatinca;
========
package cosminneagu.driver;
>>>>>>>> main:src/main/java/cosminneagu/driver/BrowserManager.java

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
    public static ChromeDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
