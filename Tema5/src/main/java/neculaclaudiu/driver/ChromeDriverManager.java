package neculaclaudiu.driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager {
    public static ChromeDriver createChromeDriver(){
        System.setProperty("webdriver.chrome.driver" , "src/test/resources/chromedriver.exe");
        return new ChromeDriver();
    }
}
