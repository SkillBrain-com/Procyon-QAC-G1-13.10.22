package AndreeaG.tests.tema5.Demoqa;

import org.openqa.selenium.chrome.ChromeDriver;
import teofilursan.driver.BrowserManager;

public class TryPractice {

    public static void main(String[] args) {

        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://class.skillbrain.com/unit/view/id:2306");
    }
}