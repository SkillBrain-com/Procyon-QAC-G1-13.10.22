package alinatinca.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class BrowserManager {

    public static ChromeDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        //create and configure Chrome browser page settings
        return new ChromeDriver();
    }

    public static ChromeDriver createChromeDriverWithOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
        //create a method that sets fullscreen option and configures Chrome browser page setting
    }

    public static ChromeDriver createChromeDriverForMobile(){
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Iphone X");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        return new ChromeDriver(chromeOptions);
        //create a method that simulates on mobile
    }
}
