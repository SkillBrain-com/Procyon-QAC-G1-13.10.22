package sorinfoca.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserManager {
    public static ChromeDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    RemoteWebDriver driver;

    public static RemoteWebDriver createRemoteWebDriver() {

        try {
            return new RemoteWebDriver(new URL("http://localhost:4444/"),new ChromeOptions());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
