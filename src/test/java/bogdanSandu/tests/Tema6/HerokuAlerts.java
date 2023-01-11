package bogdanSandu.tests.Tema6;

import bogdanSandu.driver.BrowserManager;
import bogdanSandu.utils.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class HerokuAlerts {

    static ChromeDriver driver = null;
    public static void main(String[] args) throws IOException {

        navigateToHerokuPage();
        openAlertPage();
        openAlert();
        acceptAlert();
        scrollToSubmitButton();
        closeBrwoser();


        navigateToHerokuPage();
        try{
            openAlert();
        }catch (NoSuchElementException e){
            FileUtils.takeScreenshot(driver, "alert");
        } finally {
            closeBrwoser();
        }



    }

    public static void navigateToHerokuPage(){
        driver = BrowserManager.createDriverAndGetPage();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        System.out.println("Am deschis Heroku index app!");
    }

    public static void openAlertPage(){
        WebElement alertsLink = driver.findElement(By.id("alerttest"));
        alertsLink.click();
        System.out.println("Am navigat catre alerts page!");
    }

    public static void openAlert(){
        WebElement clickSecondAlertButtom =driver.findElement(By.xpath("//input[@id='confirmexample']"));
        clickSecondAlertButtom.click();
        System.out.println("Am dat click pe secondAlertButton!");
    }

    public static void acceptAlert(){
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.accept();
        System.out.println("Am dat acceptat alerta!");
    }

    public static void scrollToSubmitButton() {
        WebElement submitButton = driver.findElement(By
                .xpath("//input[@type='submit']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButton).build().perform();
        submitButton.click();
        System.out.println("Am facut scroll catre submit button");
    }
    public static void closeBrwoser(){
        driver.quit();
        System.out.println("Am inchis browserul!");
    }
}
