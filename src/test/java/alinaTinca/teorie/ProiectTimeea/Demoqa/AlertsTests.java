package alinatinca.teorie.ProiectTimeea.Demoqa;

import AlinaTinca.driver.BrowserManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.NoSuchElementException;

public class AlertsTests {

    public static void main(String[] args) {
//        firstAlert();
//        thirdAlert();
        fourthAlert();
    }

    public static void firstAlert() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/alerts");
        System.out.println("Navigheaza la pagina");
        WebElement firstButton = driver.findElement(By.id("alertButton"));
        firstButton.click();
        Alert firstAlert = driver.switchTo().alert();
        System.out.println("Indentifica alerta");
        firstAlert.accept();
        System.out.println("Accepta alerta");
        System.out.println("Textul afisat este: " + firstAlert.getText());
        driver.quit();
    }

    public static void thirdAlert() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.createChromeDriver();
            driver.get("https://demoqa.com/alerts");
            System.out.println("Navigheaza la pagina");
            WebElement thirdButton = driver.findElement(By.id("confirmButton"));
            thirdButton.click();
            System.out.println("Da click pe al treilea buton");
            Alert thirdAlert = driver.switchTo().alert();
            System.out.println("Indentifica alerta");
            System.out.println("Textul afisat in alerta este: " + thirdAlert.getText());
            thirdAlert.accept();
            System.out.println("Accepta alerta");
            WebElement message = driver.findElement(By.id("confirmResult"));
            System.out.println("Mesajul dupa ce alerta este acceptata este: " + message.getText());
            System.out.println("Is alert open after it has been closed: " + isAlertOpened());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static boolean isAlertOpened() {
        try {
            return true;
        } catch (Exception | Error e) {
            return false;
        }
    }
    public static void fourthAlert(){
        ChromeDriver driver = null;
        try{
            driver = BrowserManager.createChromeDriver();
            driver.get("https://demoqa.com/alerts");
            System.out.println("Navigheaza la pagina");
            WebElement fourthButton = driver.findElement(By.id("promtButton"));
            fourthButton.click();
            System.out.println("Da click pe al patrulea buton");
            Alert fourthAlert = driver.switchTo().alert();
            System.out.println("Indentifica alerta");
            fourthAlert.sendKeys("test");
            System.out.println("Introducem mesajul: test");
//        fourthAlert.accept();
//        System.out.println("Accepta alerta");
//        WebElement message = driver.findElement(By.id("promptResult"));
//        System.out.println("Mesajul introdus dupa ce alerta a fost acceptata este: " + message.getText());
            fourthAlert.dismiss();
            System.out.println("Respingem alerta");
            WebElement message = driver.findElement(By.id("promptResult"));
            System.out.println("Mesajul introdus de noi dupa ce alerta a fost respinsa este: " + message.getText());
            System.out.println("Is alert open after it has been closed: " + isAlertOpened());
        }finally {
            if(driver != null){
                driver.quit();
            }
        }
    }


// Aici am incercat sa folosesc catch pentru exceptia primita!

//    public static void fourthAlert() {
//        ChromeDriver driver = null;
//        try {
//            driver = BrowserManager.createChromeDriver();
//            driver.get("https://demoqa.com/alerts");
//            System.out.println("Navigheaza la pagina");
//            WebElement fourthButton = driver.findElement(By.id("promtButton"));
//            fourthButton.click();
//            System.out.println("Da click pe al patrulea buton");
//            Alert fourthAlert = driver.switchTo().alert();
//            System.out.println("Indentifica alerta");
//            fourthAlert.sendKeys("test");
//            System.out.println("Introducem mesajul: test");
////        fourthAlert.accept();
////        System.out.println("Accepta alerta");
////        WebElement message = driver.findElement(By.id("promptResult"));
////        System.out.println("Mesajul introdus dupa ce alerta a fost acceptata este: " + message.getText());
//            fourthAlert.dismiss();
//            System.out.println("Respingem alerta");
//            WebElement message = driver.findElement(By.id("promptResult"));
//            System.out.println("Mesajul introdus de noi dupa ce alerta a fost respinsa este: " + message.getText());
//            System.out.println("Is alert open after it has been closed: " + isAlertOpened());
//        }catch (NoSuchElementException e){
//            System.out.println("Nu mai zice ca nu a reusit sa localizeze elementul prompt Result, ci a prins exceptia si a tratat-o!");
//        } finally {
//            if (driver != null) {
//                driver.quit();
//            }
//        }
//    }
}