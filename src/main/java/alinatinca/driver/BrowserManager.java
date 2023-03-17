package alinatinca.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserManager {

//    public static ChromeDriver createChromeDriver(){
//        WebDriverManager.chromedriver().setup();
//        return new ChromeDriver();
//    }
    //pentru vechia versiune de Chrome

    public static ChromeDriver createChromeDriverWithOptions(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(option);
    }
    //pentru noua versiune de Chrome
}