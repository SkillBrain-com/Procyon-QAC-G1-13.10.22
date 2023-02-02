package alinatinca.teorie.ProiectTimeea.Heroku;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.ThreadPoolExecutor;

public class AlertsTests {

    public static void main(String[] args) {
        secondAlert();
    }

    public static void firstAlert(){
        ChromeDriver driver = null;
        try{
        driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        System.out.println("Navigheaza la pagina");
        WebElement firstButton = driver.findElement(By.id("alertexamples"));
        firstButton.click();
        System.out.println("Da click pe primul buton");
        Alert firstAlert = driver.switchTo().alert();
        System.out.println("Indentifica alerta");
        System.out.println(firstAlert.getText());
        firstAlert.accept();
        System.out.println("Accepta alerta");
        System.out.println("Is alert open after it has been closed " + isAlertOpened(driver));
        }
        finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static  void secondAlert(){
        ChromeDriver driver = null;
        try{
            driver = BrowserManager.createChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
            System.out.println("Navigheaza la pagina");
            WebElement secondButton = driver.findElement(By.id("confirmexample"));
           for(int i = 0; i <=1; i ++){
               secondButton.click();
               System.out.println("Da click pe al doilea buton");
               System.out.println("Is alert open after click on button " + isAlertOpened(driver));
               Alert secondAlert = driver.switchTo().alert();
               System.out.println("Indentifica alerta");
               secondAlert.dismiss();
               System.out.println("Respingem alerta");
               System.out.println(driver.findElement(By.id("confirmretval")).getText());
               System.out.println("Is alert open after it has been closed " + isAlertOpened(driver));
           }
        }
        finally {
            if(driver != null){
                driver.quit();
            }
        }
    }

    public static boolean isAlertOpened(ChromeDriver driver){
        try{
            driver.switchTo().alert();
            return true;
        }catch(NoAlertPresentException e){
            return false;
        }
    }
}