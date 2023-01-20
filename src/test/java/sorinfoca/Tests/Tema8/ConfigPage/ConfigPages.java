package sorinfoca.Tests.Tema8.ConfigPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ConfigPages {

    private WebDriverWait wait;

    protected ChromeDriver driver = null;

    private static String baseUrl = "https://testpages.herokuapp.com/";

    public static String getBaseUrl() {
        return baseUrl;
    }

    @BeforeTest
    public ChromeOptions setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
