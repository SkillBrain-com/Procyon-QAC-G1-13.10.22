package alinaTinca.tests.Tema5.Demoqa.Elements;

import AlinaTinca.BrowserManagerClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksClass {

    public static void main(String[] args) {
        goToTheLinks();
        //check if the method called goToTheLinks is done successfully
    }

    public static void goToTheLinks(){
        //create a method called goToTheLinks that find a link and it clicks on it
        ChromeDriver driver = BrowserManagerClass.createChromeDriver();
        //create and configure the Chrome browser page settings
        driver.get("https://demoqa.com/links");
        //go to this URL
        WebElement LinksSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[6]"));
        //find the Links section
        LinksSection.click();
        //click on this section
        WebElement CreatedLink = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p[3]/a"));
        //find the third link called Created
        CreatedLink.click();
        //click on this link
        driver.get("https://demoqa.com/links");
        //go back to the main page
        driver.quit();
        //close the Chrome browser page
    }
}
