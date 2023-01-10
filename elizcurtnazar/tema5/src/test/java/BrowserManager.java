import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
    public static ChromeDriver createDriver(){ //cream un obiect de tipu driver. cream pagina de chrome. o inscriem intro clasa
        WebDriverManager.chromedriver().setup(); // initializam
        return new ChromeDriver(); // returnam o instanta de chromedriver
    }

    public static void closeChromeDriver(ChromeDriver driver){

        driver.quit(); //inchide driverul
    }


}
