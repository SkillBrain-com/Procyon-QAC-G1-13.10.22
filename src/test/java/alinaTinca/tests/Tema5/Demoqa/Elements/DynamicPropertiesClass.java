package alinaTinca.tests.Tema5.Demoqa.Elements;

import AlinaTinca.BrowserManagerClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPropertiesClass {

    public static void main(String[] args) {
        goToTheDynamicProperties();
        //check if the method called goToTheDynamicProperties is done successfully
    }

    public static void goToTheDynamicProperties(){
        //create a method called goToTheDynamicProperties that identifies the second button from Dynamic Properties section
        ChromeDriver driver = BrowserManagerClass.createChromeDriver();
        //create and configure the Chrome browser page settings
        driver.get("https://demoqa.com/dynamic-properties");
        //go to this URL
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        //scroll on the page
        WebElement DynamicProprietiesSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[9]/span"));
        //find the section called Dynamic Proprieties Section
        DynamicProprietiesSection.click();
        //click on this section
        WebElement ColorChangeButton = driver.findElement(By.cssSelector("button[id='colorChange']"));
        //find the third button called Color Change
        ColorChangeButton.click();
        //click on this button
        driver.quit();
        //close the Chrome browser page
    }
}
