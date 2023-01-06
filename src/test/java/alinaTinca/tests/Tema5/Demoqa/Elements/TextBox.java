package alinaTinca.tests.Tema5.Demoqa.Elements;

import AlinaTinca.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

    public static void main(String[] args) {
    goToTheTextBoxAndCheckIt("Georgiana Alina","test@test.com","Bucharest","Romania");
    }
    //check if the method called goToTheTextBoxAndCheckIt is done successfully

    public static void goToTheTextBoxAndCheckIt(String fullNameInput, String EmailInput, String currentAddressInput, String permanentAddressInput) {
        //create the method called goToTheBoxAndCheckIt that goes to the section called Text Box and it identifies and makes several operations there
        ChromeDriver driver = BrowserManager.createChromeDriver();
        //create and configure the Chrome browser page settings
        driver.get("https://demoqa.com/text-box");
        //go to Demoqa URL
        WebElement TextBoxSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]"));
        //search the section called Text Box from the section called Elements
        TextBoxSection.click();
        //click on the section calles Text Box
        WebElement fullNameField = driver.findElement(By.id("userName"));
        //search the Full Name field
        WebElement EmailField = driver.findElement(By.id("userEmail"));
        //search the E-mail field
        WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
        //search the Current Address field
        WebElement permanentAddressField = driver.findElement(By.id("permanentAddress"));
        //search the Permanent Address field
        fullNameField.click();
        //click on the Full Name field
        fullNameField.clear();
        //clear the previous data from the Full Name field
        fullNameField.sendKeys(fullNameInput);
        //introduce new full name
        fullNameField.sendKeys(Keys.TAB);
        //pass to the next field
        EmailField.click();
        //click on the E-mail field
        EmailField.clear();
        //clear the previous data from the Email filed
        EmailField.sendKeys(EmailInput);
        //introduce new email
        EmailField.sendKeys(Keys.TAB);
        //pass to the next field
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        //scroll on the page
        currentAddressField.click();
        //click in the Current Address field
        currentAddressField.clear();
        //clear previous data from Current Address field
        currentAddressField.sendKeys(currentAddressInput);
        //introduce new current address
        currentAddressField.sendKeys(Keys.TAB);
        //pass to the next field
        permanentAddressField.click();
        //click on the Permanent Address field
        permanentAddressField.clear();
        //clear the previous data from the Permanent Address field
        permanentAddressField.sendKeys(permanentAddressInput);
        //introduce new permanent address
        permanentAddressField.sendKeys(Keys.TAB);
        //pass to the next field
        WebElement submitButton = driver.findElement(By.id("submit"));
        //find the button called Submit
        submitButton.sendKeys(Keys.ENTER);
        //click Enter on the Submit Button
        driver.quit();
        //close the Chrome browser page
    }
}
