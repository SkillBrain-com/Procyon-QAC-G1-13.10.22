package bogdanSandu.tests.Tema7;

import bogdanSandu.driver.BrowserManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class CURAHealthcare {
    static ChromeDriver driver = null;

    public void openCURAHealthPage() {
        driver = BrowserManager.createDriverAndGetPage();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println("Am deschis CURA Healthcare Service page");
    }


}
