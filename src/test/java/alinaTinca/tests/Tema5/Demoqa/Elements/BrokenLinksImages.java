package alinaTinca.tests.Tema5.Demoqa.Elements;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksImages {

    public static void main(String[] args) {
        goToTheBrokenLinksImages();
        //check if the method called goToTheBrokenLinksImages is done successfully
    }

    public static void goToTheBrokenLinksImages(){
        //create a method called goToTheBrokenLinksImages that goes to the Broken Links-Images section and identifies elements and make operations on them
        ChromeDriver driver = BrowserManager.createChromeDriver();
        //create and configure the Chrome browse page settings
        driver.get("https://demoqa.com/broken");
        //get to the Demoqa URL
        WebElement brokenLinksImagesSection = driver.findElement(By.xpath("//div[@Class='element-list collapse show']/ul/li[7]"));
        //find the section called Broken Links Images
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", brokenLinksImagesSection);
        //scroll to the Broken Links Images Section
        brokenLinksImagesSection.click();
        //click on this section
        WebElement lastLink = driver.findElement(By.xpath("//a[@href='http://the-internet.herokuapp.com/status_codes/500']"));
        //find the last link called Broken Link
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView();", lastLink);
        //scroll to the last link called Broken Link
        lastLink.click();
        //click on the last link called Broken Link
        driver.get("https://demoqa.com/broken");
        //go back to the main page
        driver.quit();
        //close the Chrome browser page
    }
}
