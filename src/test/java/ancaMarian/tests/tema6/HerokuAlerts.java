package ancaMarian.tests.tema6;

import ancaMarian.driver.BrowserManager;
import ancaMarian.utils.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class HerokuAlerts {
    static ChromeDriver driver = null;

    public static void main(String[] args) throws IOException {
    navigateToHerokuHomePage();
    openAlertsPage();
    openAlert();
    acceptAlert();
    closeBrowser();

    navigateToHerokuHomePage();
    try {
        openAlert();
    } catch (NoSuchElementException e){
        FileUtils.takeScreenshot(driver, "alert");
        } finally {
        closeBrowser();}
    }
    public static void navigateToHerokuHomePage(){
        driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        System.out.println("Am deschis Heroku index page.");
    }

    public static void openAlertsPage(){
        WebElement alertsLink = driver.findElement(By.id("alerttest"));
        alertsLink.click();
        System.out.println("Am deschis Alert page.");
    }

    public static void openAlert(){
        WebElement secondAlertButton = driver.findElement(By.xpath("//input[@id='confirmexample']"));
        secondAlertButton.click();
        System.out.println("Am deschis alerta.");
    }

    public static void acceptAlert(){
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.accept();
        System.out.println("Am acceptat alerta.");
    }

    public static void closeBrowser(){
        driver.quit();
        System.out.println("Am inchis browserul.");
    }
}
