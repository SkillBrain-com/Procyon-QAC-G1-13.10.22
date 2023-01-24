package cosminsechel.tests.tema8.pages;
import org.openqa.selenium.WebDriver;

public class JavaScriptRedirectPage {
    private final WebDriver driver;
    private final String url;

    public JavaScriptRedirectPage(WebDriver driver) {
        this.driver = driver;
        this.url = "https://testpages.herokuapp.com/styled/javascript-redirect-test.html";
    }

    public void goToPage() {
        driver.get(url);
    }

}
