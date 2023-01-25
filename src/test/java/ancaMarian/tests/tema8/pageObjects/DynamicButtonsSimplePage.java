package ancaMarian.tests.tema8.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicButtonsSimplePage {

    ChromeDriver driver;
    WebDriverWait wait;

    public DynamicButtonsSimplePage(ChromeDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }


}
