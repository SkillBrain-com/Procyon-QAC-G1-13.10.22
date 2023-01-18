package catalinazoldi2test.tests.tema6;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import zoldicatalina2.driver.BrowserMananger;

 import java.io.File;
import java.io.IOException;

public class HerokuAllert {

    static ChromeDriver driver = null;

    public static void main(String[] args) throws IOException {
        navigateToHerokuAllert();
        openAlertsPage();
        openAlert();
        acceptAlert();
        closeBrowser();

       // navigateToHerokuHomePage();
      //  try{
           // openAlert();
       // }catch (NoSuchElementException e) {
          //  FileUtils.takeScreenshot(driver, "alert");
        //}
      //  finally {
         //   closeBrowser();

       // }

    }

    private static void navigateToHerokuHomePage() {
    }


    public static void navigateToHerokuAllert() {
         driver = BrowserMananger.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        System.out.println("Am mers la Heroku page");
    }

    public static void openAlertsPage() {
        WebElement alertslink = driver.findElement(By.id("alerttest"));
        alertslink.click();
        System.out.println("Am navigat catre alert page");
    }
    public static void openAlert(){
        WebElement secondButton = driver.findElement(By.xpath("//input[@id='confirmexample']"));
                // /imput[@id='confirmtexamples']
        secondButton.click();
        System.out.println("Am gasit second button");


    }
    public static  void acceptAlert(){
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.accept();
        System.out.println("Am apasat second button");
    }


    public static void closeBrowser(){
       driver.quit();
        System.out.println("Am inchis pagina");

    }
}
