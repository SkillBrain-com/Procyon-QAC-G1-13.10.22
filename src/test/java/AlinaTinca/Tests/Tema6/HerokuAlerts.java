package AlinaTinca.Tests.Tema6;

import AlinaTinca.Utils.FileUtils;
import AlinaTinca.driver.BrowserManager;
import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
//EX 1
public class HerokuAlerts {

    //INCOMPLET, DE REVENIT

    static ChromeDriver driver = null;

    public static void main(String[] args) throws IOException {
        navigateToHerokuHomePage();
        openAlertsPage();
//        firstParagraph();
//        getInstructionsForAlertButtons();

//        openAlertForFirstButton();
//        acceptAlert();
//        openAlertForSecondButton();
//        dismissAlert();

//        openAlertForThirdButton();

//        acceptAlert();
//        closeBrowser();



//        navigateToHerokuHomePage();
//        try {
//            openAlert();
//        } catch (NoSuchElementException e) {
//            FileUtils.takeScreenshot(driver, "alert");
//        } finally{
//                closeBrowser();
//            }
    }

    public static void navigateToHerokuHomePage() {
        driver = BrowserManager.createChromeDriver();
        //create the driver instance
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //go to the above URL
        System.out.println("This URL has been opened!");
        //display the above message

    }

    public static void openAlertsPage(){
        WebElement alertsLink = driver.findElement(By.id("alerttest"));
        //find the alerts page
        alertsLink.click();
        //click on the alerts page
        System.out.println("The alerts page has been opened!");
        //display the above message
    }

    public static void firstParagraph() {
        WebElement firstParagraph = driver.findElement(By.className("explanation"));
        //find the first paragraph
        System.out.println("The first paragraph has the following message: " + firstParagraph.getText());
        //display the message for the first paragraph
    }

    public static void getInstructionsForAlertButtons() {
        WebElement messageForFirstAlertButton = driver.findElement(By.xpath("//*[contains(text(),'The following button will display an alert when clicked.')]"));
        //find the instruction for the first alert button
        System.out.println("The first alert button has the following instruction: " + messageForFirstAlertButton.getText());
        //display the instruction for the first alert button
//        WebElement firstAlertButton = driver.findElement(By.xpath("//input[@value='Show alert box']"));
//        //find the first alert button
//        System.out.println("The first alert button contents the following message: " + firstAlertButton.getText());
//        //display the message of the first alert button
        WebElement messageForSecondAlertButton = driver.findElement(By.xpath("//*[contains(text(),'The following button will display a confirm dialog when clicked.')]"));
        //find the instruction for the second alert button
        System.out.println("The second alert button has the following instruction: " + messageForSecondAlertButton.getText());
        //display the instruction for the first alert button
//        WebElement secondAlertButton = driver.findElement(By.id("confirmexample"));
//        //find the second alert button
//        System.out.println("The second alert button contents the following message: " + secondAlertButton.getText());
//        //display the message of the second alert button
        WebElement messageForThirdAlertButton = driver.findElement(By.xpath("//*[contains(text(),'The following button will display a prompt dialog when clicked.')]"));
        //find the instruction for the second alert button
        System.out.println("The third alert button has the following instruction: " + messageForThirdAlertButton.getText());
        //display the instruction for the first alert button
//        WebElement thirdAlertButton = driver.findElement(By.id("promptexample"));
//        //find the third alert button
//        System.out.println("The third alert button contents the following message: " + thirdAlertButton.getText());
//        //display the message of the third alert button

    }

    public static void openAlertForFirstButton() {
        WebElement firstAlertButton = driver.findElement(By.id("alertexamples"));
        //find the first alert button
        firstAlertButton.click();
        //click on the first alert button
        System.out.println("Click on the first alert button");
        //display the above message
        Alert firstAlert = driver.switchTo().alert();
        //create the alert for the first alert and switch to it
        System.out.println("The message displayed after the alert openes is: " +firstAlert.getText());
        //display the message after the alert openes
    }


    public static void acceptAlert() {
        Alert firstAlert = driver.switchTo().alert();
        //create the alert for the first alert and switch to it
        firstAlert.accept();
        //click on OK button when the alert is opened
        System.out.println("The alert has been accepted");
        //The alert has been accepted
    }

    public static void openAlertForSecondButton () {
        WebElement secondAlertButton = driver.findElement(By.id("confirmexample"));
        //find the second alert button
        secondAlertButton.click();
        //click on the second alert button
        System.out.println("Click on the second alert button");
        //display the above message
        Alert secondAlert = driver.switchTo().alert();
        //create the alert for the second alert and switch to it
        System.out.println("The message displayed after the alert openes is: " +secondAlert.getText());
        //display the message after the alert openes

    }

   public static void dismissAlert () {
        Alert secondAlert = driver.switchTo().alert();
        //create the alert for the second alert and switch to it
        secondAlert.dismiss();
        //click on Cancel button when the alert is opened
        System.out.println("The alert has been dissmised");
        //The alert has been dissmised

   }
//    DE REVENIT

//    public static void openAlertForThirdButton () {
//        WebElement thirdAlertButton = driver.findElement(By.id("promptexample"));
//        //find the third alert button
//        Actions actions = new Actions(driver);
//        actions.moveToElement(thirdAlertButton).build().perform();
//        //scroll to the third alert button
//        thirdAlertButton.click();
//        //click on the third alert button
//        Alert thirdAlert = driver.switchTo().alert();
//        thirdAlert.sendKeys("new message");
////      thirdAlertButton.sendKeys("new message");     //de revenit
//        System.out.println("Click on the third alert button");
//        //display the above message
//    }

    public static void closeBrowser(){
        driver.quit();
        //close the driver instance
        System.out.println("The driver instance has been closed!");
        //display the above message
    }
}

