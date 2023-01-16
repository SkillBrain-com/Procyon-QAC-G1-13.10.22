package alinaTinca.teorie.seleniumbasicpart2;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertExample {
    public static void main(String[] args) {
//        openAndSubmitAlert();
        openAndSubmitWindow();
    }

//    public static void openAndSubmitAlert() {
//        ChromeDriver driver = null;
//        try {
//            driver = BrowserManager.createChromeDriver();
//            driver.get("https://demoqa.com/alerts");
//            WebElement thirdAlertButton = driver.findElement(By.id("confirmButton"));
//            thirdAlertButton.click();
//            Thread.sleep(2000);   //punem un timer de 2 sec pt a opri executia testului dupa ce da clic pe buton pana va executa urmatoarea comanda de switchTo
//            Alert alert = driver.switchTo().alert();   //focusul de pe pag pricipala s-a mutat pe alerta din fereastra noua deschisa
//            System.out.println(alert.getText());
//            alert.accept();
//        } catch (Exception e) {
//            System.out.println("Am intrat in catch");
//        } finally {
//            if (driver != null) {
//                driver.quit();
//            }
//        }
//
//    }

    public static void openAndSubmitWindow() {  //De revenit
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.createChromeDriver();
            driver.get("https://demoqa.com/browser-windows");
            WebElement firstButton = driver.findElement(By.id("tabButton"));
            firstButton.click();
            Thread.sleep(2000);   //punem un timer de 2 sec pt a opri executia testului dupa ce da clic pe buton pana va executa urmatoarea comanda de switchTo
            Alert alert = driver.switchTo().alert();   //focusul de pe pag pricipala s-a mutat pe alerta din fereastra noua deschisa
            driver.close();
            driver.switchTo().parentFrame();
            System.out.println(alert.getText());
            alert.accept();
        } catch (Exception e) {
            System.out.println("Am intrat in catch");
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }

    }
}
