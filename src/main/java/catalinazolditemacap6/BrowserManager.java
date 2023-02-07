package catalinazolditemacap6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
<<<<<<< HEAD:src/main/java/catalinazolditemacap6/BrowserManager.java
    public static ChromeDriver createDriverAndGetPage() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    public static void closeBrowser(ChromeDriver driver){
        driver.quit();
    }
=======
    public static ChromeDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

>>>>>>> main:src/main/java/teofilursan/driver/BrowserManager.java
}
