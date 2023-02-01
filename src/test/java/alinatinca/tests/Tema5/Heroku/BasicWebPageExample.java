package alinatinca.tests.Tema5.Heroku;


import alinatinca.driver.BrowserManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebPageExample {

    public static void main(String[] args) {
        goToBasicWebPage();
        //check if the method called goToBasicWebPage is done successfully
    }

    public static void goToBasicWebPage() {
        //create a method called goToBasicWebPage that goes to the link called Basic Web Page from this URL and identifies several elements from there
        ChromeDriver driver = BrowserManager.createChromeDriver();
        //create and configure the Chrome browser page settings
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //go to Heroku URL
        WebElement link1 = driver.findElement(By.cssSelector("a[id='basicpagetest']"));
        //search for the first link
        System.out.println("The first link has the following content: " + link1.getText());
        //display the message from the first link
        link1.click();
        //click on first link
        WebElement firstParagraph = driver.findElement(By.cssSelector(".explanation"));
        //search for the first paragraph
        System.out.println("The first paragraph has the following content: " + firstParagraph.getText());
        //display the message from the second paragraph
        WebElement lastParagraph = driver.findElement(By.className("sub"));
        //search for last paragraph
        System.out.println("The last paragraph has the following content: " + lastParagraph.getText());
        //display the message from the last paragraph
        driver.quit();
        //close the Chrome browser page
    }
}
