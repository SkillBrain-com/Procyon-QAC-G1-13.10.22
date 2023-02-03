package alinatinca.teorie.ProiectTimeea.Heroku;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.ThreadPoolExecutor;

public class AlertsTests {

    public static void main(String[] args) {
//        secondAlert();
        thirdAlert();
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

    public static void thirdAlert(){
        ChromeDriver driver = null;
        try{
            driver = BrowserManager.createChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
            System.out.println("Navigheaza la pagina" +
                    "");
            WebElement thirdButton = driver.findElement(By.id("promptexample"));
            Actions actions = new Actions(driver);
            actions.moveToElement(thirdButton).build().perform();
            System.out.println("Face scroll pana la al treilea buton de pe pagina");
            thirdButton.click();
            System.out.println("Da clic pe al treilea buton");

            Alert thirdAlert1 = driver.switchTo().alert();
            System.out.println("Indentifica alerta");
            thirdAlert1.sendKeys("text for test");
//            thirdAlert1.accept();
//            System.out.println("Accepta alerta");
//            WebElement messageAfterAcceptAlert1 = driver.findElement(By.id("promptreturn"));
//            System.out.println("Mesajul dupa ce am introdus textul in aceasta alerta este: " + messageAfterAcceptAlert1.getText());
//            WebElement messageForAcceptAlert1 = driver.findElement(By.id("promptexplanation"));
//            System.out.println("Mesajul dupa ce alerta este acceptata este: " + messageForAcceptAlert1.getText());

            thirdAlert1.dismiss();
            WebElement messageAfterAcceptAlert2 = driver.findElement(By.id("promptreturn"));
            System.out.println("Mesajul dupa ce am introdus textul in aceasta alerta este: " + messageAfterAcceptAlert2.getText());
            WebElement messageForAcceptAlert2 = driver.findElement(By.id("promptexplanation"));
            System.out.println("Textul dupa ce alerta este refuzata este: " + messageForAcceptAlert2.getText());
        }catch (NoAlertPresentException e){
            System.out.println("Exceptia nu mai apare!");
        }
        finally {
            if (driver !=null ){
                driver.quit();
            }
        }
    }
}