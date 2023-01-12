package BogdanSandu.tests.Tema6;


import BogdanSandu.driver.BrowserManager;
import BogdanSandu.utils.FileUtils;
import jdk.jfr.Timespan;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.sql.Time;

public class HerokuAlerts {

    static ChromeDriver driver = null;
    public static void main(String[] args) throws IOException {

        navigateToHerokuPage();
        openAlertPage();
        textFromAlertPage();
        openAlertBox();
        firstAlertText();
        acceptFirstAlert();
        openSecondAlertButton();
        secondAlertText();
//        acceptAlert();
        cancelSecondAlert();
        secondAlertAfterCancel();
//        scrollToSubmitButton();
        closeBrwoser();


        navigateToHerokuPage();
        try{
            openSecondAlertButton();
        }catch (NoSuchElementException e){
            FileUtils.takeScreenshot(driver, "alert");
        } finally {
            closeBrwoser();
        }



    }

    public static void navigateToHerokuPage(){
        driver = BrowserManager.createDriverAndGetPage();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        System.out.println("Am deschis Heroku index app!");
    }

    public static void openAlertPage(){
        WebElement alertsLink = driver.findElement(
                By.id("alerttest"));
        alertsLink.click();
        System.out.println("Am navigat catre alerts page!");
    }

    public static void textFromAlertPage(){
        WebElement textAlertPage = driver.findElement(
                By.className("explanation"));
        System.out.println("Textul din Alert Box Example: \"" + textAlertPage.getText() + "\"");
    }

    public static void openAlertBox(){
        WebElement clickFirstAlertButton = driver.findElement(
                By.xpath("//input[@id='alertexamples']"));
        clickFirstAlertButton.click();
        System.out.println("Am dat click pe firstSecondAlertButton!");
    }

    public static void firstAlertText(){
        Alert firstAlertText = driver.switchTo().alert();
        firstAlertText.getText();
        System.out.println("Textul alertei nr.1: \"" + firstAlertText.getText() + "\"");

    }

    public static void acceptFirstAlert(){
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();
        System.out.println("Am dat accept la firstAlert!");
    }

    public static void openSecondAlertButton(){
        WebElement clickSecondAlertButton =driver.findElement(
                By.xpath("//input[@id='confirmexample']"));
        clickSecondAlertButton.click();
        System.out.println("Am dat click pe secondAlertButton!");
    }

    public static void secondAlertText(){
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.getText();
        System.out.println("Textul alertei nr.2: \"" + secondAlert.getText() + "\"");
    }

//    public static void acceptAlert(){
//        Alert secondAlert = driver.switchTo().alert();
//        secondAlert.accept();
//        System.out.println("Am dat acceptat alerta!");
//    }

    public static void cancelSecondAlert(){
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.dismiss();
        System.out.println("Am dat cancel la secondAlert!");
    }

    public static void secondAlertAfterCancel(){
//        WebElement secondText = driver.findElement(By.id("confirmexplanation"));
//        secondText.getText();
//        System.out.println("Textul dupa cancel: \"" + secondText.getText() +"\"");
        System.out.println("Textul dupa cancel: \"" + driver.findElement(By.id("confirmexplanation")).getText() + "\"");
    }

    public static void scrollToSubmitButton() {
        WebElement submitButton = driver.findElement(
                By.xpath("//input[@type='submit']"));
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