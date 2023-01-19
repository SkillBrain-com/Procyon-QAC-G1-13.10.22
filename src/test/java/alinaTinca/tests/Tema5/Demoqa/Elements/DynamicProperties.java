package alinaTinca.tests.Tema5.Demoqa.Elements;

import alinatinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicProperties {

    public static void main(String[] args) {
        goToTheDynamicProperties();
        //check if the method called goToTheDynamicProperties is done successfully
    }

    public static void goToTheDynamicProperties(){
        //create a method called goToTheDynamicProperties that identifies the second button from Dynamic Properties section
        ChromeDriver driver = BrowserManager.createChromeDriver();
        //create and configure the Chrome browser page settings
        driver.get("https://demoqa.com/dynamic-properties");
        //go to this URL
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        //scroll on the page
        WebElement dynamicProprietiesSection = driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
        //find the section called Dynamic Proprieties Section
        dynamicProprietiesSection.click();
        //click on this section
        WebElement colorChangeButton = driver.findElement(By.cssSelector("button[id='colorChange']"));
        //find the third button called Color Change
        colorChangeButton.click();
        //click on this button
        driver.quit();
        //close the Chrome browser page
    }
}
