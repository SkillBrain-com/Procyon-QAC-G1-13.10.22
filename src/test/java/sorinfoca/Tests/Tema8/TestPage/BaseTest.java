package sorinfoca.Tests.Tema8.TestPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriverWait wait;

    private Object mobileEmulation() {
        return null;
    }

    protected ChromeDriver driver = null;

    private static String baseUrl = "https://testpages.herokuapp.com/";

    public static String getBaseUrl() {
        return baseUrl;
    }

    @BeforeMethod(groups = "desktop")
    public void setUpDesktop() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod(groups = "mobile")
    public void setUpMobile() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("mobileEmulation", mobileEmulation());
        driver = new ChromeDriver(options);
    }
}
