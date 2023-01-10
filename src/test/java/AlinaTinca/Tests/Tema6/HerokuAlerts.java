package AlinaTinca.Tests.Tema6;

import AlinaTinca.Utils.FileUtils;
import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class HerokuAlerts {

    static ChromeDriver driver = null;


    public static void main(String[] args) throws IOException {
//        navigateToHerokuHomePage();
//        openAlertsPage();
//        openAlert();
//        acceptAlert();
//        closeBrowser();

        navigateToHerokuHomePage();  //1.
        try {
            openAlert();        //2.   // aici prindem alerta intrun try
        } catch (NoSuchElementException e) {     //iar in catch prindem screenshot
            FileUtils.takeScreenshot(driver, "alert");
        } finally{
                closeBrowser();   //3. 4. try-cath
            }
    }

    public static void navigateToHerokuHomePage() {
        driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        System.out.println("Am deschis Heroku index page");

    }

    public static void openAlertsPage(){
        WebElement alertsLink = driver.findElement(By.id("alerttest"));
        alertsLink.click();
        System.out.println("Am navigat catre alert page");
    }

    public static void openAlert () {
        WebElement secondAlertButton = driver.findElement(By.xpath(" //input[@id='confirmexamples']"));
        secondAlertButton.click();
        System.out.println("Am dat click pe second alert button");
    }

    public static void acceptAlert(){
        Alert secondAlert = driver.switchTo().alert();
        // defineste Alerta care face switch la alerta care s-a deschis
        secondAlert.accept();
        //accepta alerta deschisa, adica ii da ok
        System.out.println("Am acceptat alerta");
    }

    public static void closeBrowser(){
        driver.quit();
        System.out.println("Am inchis browserul");
    }
}

//pt a se salva ce am facut acum : git status