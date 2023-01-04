package bogdanSandu.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserManager {

    public static ChromeDriver createDriverAndGetPage() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    public static void closeBrowser(ChromeDriver driver){
        driver.quit();
    }
}
