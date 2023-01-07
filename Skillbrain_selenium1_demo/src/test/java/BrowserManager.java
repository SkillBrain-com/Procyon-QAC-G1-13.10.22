import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

//class used for creating an instance of ChromeDriver and for setting properties of chrome
public class BrowserManager {
    public static ChromeDriver createDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static void closeChromeDriver(ChromeDriver driver)
    {
        driver.quit();
    }
}
