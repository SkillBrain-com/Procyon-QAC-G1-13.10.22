package AlinaTinca;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

    public class BrowserManager {
        //this class contents all the interactions with the Chrome browser page

        public static ChromeDriver createChromeDriver(){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
            //create and configure the Chrome browser page settings
        }

    }
