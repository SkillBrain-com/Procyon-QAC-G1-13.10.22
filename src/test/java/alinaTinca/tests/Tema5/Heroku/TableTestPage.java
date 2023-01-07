package alinaTinca.tests.Tema5.Heroku;

import AlinaTinca.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class TableTestPage {

    public static void main(String[] args) {
        goToTheTableTestPage();
        //check if the method called gotoTableTestPage is done successfully
    }

    public static void goToTheTableTestPage(){
        //create a method called goToTheTableTestPage that goes to the link called The Table Test Page from this URL and identifies several elements from there
        ChromeDriver driver = BrowserManager.createChromeDriver();
        //create and configure the Chrome browser page settings
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //go to Heroku URL
        WebElement Link4TableTestPage = driver.findElement(By.id("tablestest"));
        //search the 4th link
        Link4TableTestPage.click();
        //click on the 4th link
        WebElement firstParagraph = driver.findElement(By.className("explanation"));
        //search the first paragraph
        System.out.println("The first paragraph has the following content: " + firstParagraph.getText());
        //display the message of the fisrt paragraph
        WebElement titleSTable = driver.findElement(By.xpath("/html/body/div/div[3]/div/table/caption"));
        //search the table
        System.out.println("The table's title is called: " + titleSTable.getText());
        //display the table's title
        WebElement contentsSTable = driver.findElement(By.id("mytable"));
        //search the table
        System.out.println("The table has the following body: " + contentsSTable.getText());
        //display the table's content
        driver.quit();
        //close the Chrome browser page
    }
}
