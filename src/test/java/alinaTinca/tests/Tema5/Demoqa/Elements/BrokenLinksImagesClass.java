package alinaTinca.tests.Tema5.Demoqa.Elements;

import AlinaTinca.BrowserManagerClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksImagesClass {

    public static void main(String[] args) {
        goToTheBrokenLinksImages();
        //check if the method called goToTheBrokenLinksImages is done successfully
    }

    public static void goToTheBrokenLinksImages(){
        //create a method called goToTheBrokenLinksImages that goes to the Broken Links-Images section and identifies elements and make operations on them
        ChromeDriver driver = BrowserManagerClass.createChromeDriver();
        //create and configure the Chrome browse page settings
        driver.get("https://demoqa.com/broken");
        //get to the Demoqa URL
        WebElement BrokenLinksImagesSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[7]/span"));
        //find the section called Broken Links Images
        BrokenLinksImagesSection.click();
        //click on this section
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        //scroll on the page
        WebElement lastLink = driver.findElement(By.xpath("//a[@href='http://the-internet.herokuapp.com/status_codes/500']"));
        //find the last link called Broken Link
        lastLink.click();
        //click on the last link called Broken Link
        driver.get("https://demoqa.com/broken");
        //go back to the main page
        driver.quit();
        //close the Chrome browser page
    }
}
