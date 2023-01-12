package ancaMarian.tests.tema6;

import ancaMarian.driver.BrowserManager;
import ancaMarian.utils.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class HerokuAlerts {
    static ChromeDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
    navigateToHerokuHomePage();
    maximizeWindow(driver);
    openAlertsPage();
    openFirstAlert();
    acceptFirstAlert();
    openSecondAlert();
    acceptAlert();
    openThirdAlert();
    completeThirdAlert();
    closeBrowser();

    navigateToHerokuHomePage();
    try {
        openSecondAlert();
    } catch (NoSuchElementException e){
        FileUtils.takeScreenshot(driver, "alertNotFound");
        System.out.println("Nu s-a gasit elementul pe pagina. S-a salvat un screenshot.");
        } finally {
        closeBrowser();}
    }

    public static void navigateToHerokuHomePage(){
        driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        System.out.println("Am deschis Heroku index page.");
    }

    public static void maximizeWindow(ChromeDriver driver){
        driver.manage().window().maximize();
    }

    public static void openAlertsPage(){
        WebElement alertsLink = driver.findElement(By.id("alerttest"));
        alertsLink.click();
        System.out.println("Am deschis Alert page.");
    }

    public static void openFirstAlert() throws InterruptedException {
        WebElement firstAlertButton = driver.findElement(By.xpath("//input[@id='alertexamples']"));
        firstAlertButton.click();
        Thread.sleep(2000);
        System.out.println("Am deschis prima alerta.");
    }

    public static void acceptFirstAlert() throws InterruptedException {
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();
        Thread.sleep(2000);
        System.out.println("Am acceptat prima alerta.");
    }

    public static void openSecondAlert() throws InterruptedException {
        WebElement secondAlertButton = driver.findElement(By.xpath("//input[@id='confirmexample']"));
        Thread.sleep(2000);
        secondAlertButton.click();
        System.out.println("Am deschis a doua alerta.");
    }

    public static void acceptAlert() throws InterruptedException {
        Alert secondAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        secondAlert.accept();
        WebElement confirmationOfAcceptance = driver.findElement(By.id("confirmreturn"));
        if (confirmationOfAcceptance.getText().equals("true")) {
            System.out.println("Am acceptat a doua alerta.");
        } else {
            System.out.println("Nu s-a efectuat acceptarea celei de-a doua alerte.");
        }
    }

    public static void openThirdAlert() {
        WebElement thirdAlertButton = driver.findElement(By.xpath("//input[@id='promptexample']"));
        thirdAlertButton.click();
        System.out.println("Am deschis a treia alerta.");
    }

    public static void completeThirdAlert() throws InterruptedException {
        Thread.sleep(5000);
        Alert thirdAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        thirdAlert.sendKeys("do change me!");
        Thread.sleep(2000);
        thirdAlert.accept();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        System.out.println("Am facut scroll pana jos de tot.");
        WebElement changeConfirmation = driver.findElement(By.id("promptreturn"));
        if (changeConfirmation.getText().equals("do change me!")) {System.out.println("Am completat si am acceptat a treia alerta.");}
        else {
            System.out.println("nu s-a efectuat schimbarea!");
        }
        Thread.sleep(2000);
    }

    public static void closeBrowser(){
        driver.quit();
        System.out.println("Am inchis browserul.");
    }
}
