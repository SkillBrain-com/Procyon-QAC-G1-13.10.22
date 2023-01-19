package ancaMarian.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
    public static ChromeDriver createDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static void maximizeWindow(ChromeDriver driver){
        driver.manage().window().maximize();
    }

    public static void closeChromeDriver(ChromeDriver driver){
        driver.quit();
    }
}