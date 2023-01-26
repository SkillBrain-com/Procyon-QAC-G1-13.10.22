package alinatinca.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BrowserManager {

    //1
    public static ChromeDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        //create and configure Chrome browser page settings
        return new ChromeDriver();
    }

    //2
    //aceasta metoda se poate adauga aici intrucat nu in toate cazurile poate fi rulata din clasele de testcase-uri (celelalte clase)
    public static ChromeDriver createChromeDriverWithOptions() {
        //aceasta metoda simuleaza testarea cu MAXIMIZED (pt desktop full) - deschide browserul cu desktop full
        //creating a ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        //set fullscreen option
        options.addArguments("start-maximized");
        //initialise driver with options defined above
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }

    //3
    //aceasta metoda este copiata de pe url: https://chromedriver.chromium.org/mobile-emulation -> Codul Java
    public static ChromeDriver createChromeDriverForMobile(){
        //aceasta metoda simuleaza testarea pe mobile (deschide browserul pe mobile)
        Map<String, String> mobileEmulation = new HashMap<>();
        //Map = lista cu o cheie si valoare -> crtl + b pt a vedea informatiile ref la MAP ;
//        Cheie: "Vulpe" -> Valoare: "Rosu" (poate fi String, int...)
//        Cheie: "Hipopotam" -> Valoare: "Gri"
//        Cheie: "Raton" -> Valoare: "Maro"
        mobileEmulation.put("deviceName", "Galaxy S8");
        //metoda asta pune o cheie si o valoare
        //in cazul lui get:-> interogam cheiea ca sa primim valoarea!!!
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        //sa faca emularea pe mobil cu aceste 2 valori
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        return new ChromeDriver((chromeOptions));
    }

    //Pentru configurarea de RemoteWebDriver
    public static RemoteWebDriver createRemoteWebDriver(){
        try {
            return new RemoteWebDriver(new URL("http://localhost:4444/"), new ChromeOptions());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
