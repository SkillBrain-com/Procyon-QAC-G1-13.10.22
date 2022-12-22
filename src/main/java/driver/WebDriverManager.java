package driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    public static ChromeDriver createChromeDriver() {
        return new ChromeDriver();
    }
}
