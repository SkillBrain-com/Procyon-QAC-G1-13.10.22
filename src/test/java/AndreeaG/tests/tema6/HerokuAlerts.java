package AndreeaG.tests.tema6;

import AndreeaG.driver.BrowserManager;
import AndreeaG.utils.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class HerokuAlerts {

    static ChromeDriver driver = null;

    public static void main(String[] args) throws IOException {

        /*navigateToHerrokuHomePage();
        openAlertsPage();
        openAlert();
        acceptAlert();
        closeBrowser(); */


        navigateToHerrokuHomePage();
        try {
            openAlert();
        } catch (NoSuchElementException e) {
            File source = driver.getScreenshotAs(OutputType.FILE);
            String destinationFile = System.getProperty("user.dir") + "/Logs/printScreen.png";
            FileUtils.copyFile(source, new File(destinationFile));

        } finally {

            closeBrowser();
        }
    }



    public static void navigateToHerrokuHomePage() {
        driver = BrowserManager.createChromeDriver();
        driver.get ("https://testpages.herokuapp.com/styled/index.html");
        System.out.println(" Am deschis Heroku index page");
    }


    public static void openAlertsPage(){
        WebElement alertsLink = driver.findElement(By.id("alerttest"));
        alertsLink.click();
        System.out.println("am navigat catre Alerts page");
    }


    public static void openAlert(){
      WebElement secondAlertButton = driver.findElement(By.xpath("//input[@id='confirmexample']"));
        // //input[@id='confimexamples']
        secondAlertButton.click();

        System.out.println("Am dat click pe second alert");
    }

    public static void acceptAlert(){
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.accept();
        System.out.println("Am acceptat alert");
    }
   public static void closeBrowser() {
        driver.quit();

       System.out.println("Am inchis browser!");
   }
}
