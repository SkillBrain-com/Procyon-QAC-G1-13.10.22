package alinatinca.teorie.ProiectTimeea;

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
        WebElement firstButton = driver.findElement(By.id("alertexamples"));
        firstButton.click();
        Alert firstAlert = driver.switchTo().alert();
        System.out.println(firstAlert.getText());
        firstAlert.accept();
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
            WebElement secondButton = driver.findElement(By.id("confirmexample"));
           for(int i = 0; i <=1; i ++){
               secondButton.click();
               System.out.println("Is alert open after click on button " + isAlertOpened(driver));
               Alert secondAlert = driver.switchTo().alert();
               secondAlert.dismiss();
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

