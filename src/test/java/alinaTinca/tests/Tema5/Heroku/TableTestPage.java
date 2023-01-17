package alinaTinca.tests.Tema5.Heroku;

import AlinaTinca.BrowserManager;
import AlinaTinca.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableTestPage {

    static  ChromeDriver driver = null;

    public static void main(String[] args) {
        //check if the below methods are done successfully
        goToTheTableTestPage();
        firstParagraph();
        getInfoForTable();
        closeBrowser();
    }

    public static void goToTheTableTestPage() {
        //create a method called goToTheTableTestPage that creates the driver instance and goes to the below URL and makes different operations
        driver = BrowserManager.createChromeDriver();
        //create and configure the Chrome browser page settings
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //go to Heroku URL
        System.out.println("Go to the link called Table Test Page");
        //display the below message
        WebElement link4TableTestPage = driver.findElement(By.id("tablestest"));
        //search the 4th link
        link4TableTestPage.click();
        //click on the 4th link
    }

    public static void firstParagraph(){
        //create a method called firstParagraphFromTableTestPage that goes to the first paragraph from that page
        WebElement firstParagraph = driver.findElement(By.className("explanation"));
        //search the first paragraph
        System.out.println("The first paragraph has the following content: " + firstParagraph.getText());
        //display the message of the fisrt paragraph
    }

    public static void getInfoForTable(){
        //create a method called getInfoForTable that offers different informations about the table
        WebElement titleSTable = driver.findElement(By.xpath("//*[contains(text(),'This table has information')]"));
        //find the table's title
        System.out.println("The table's title is called: " + titleSTable.getText());
        //display the table's title
        System.out.println("The table has the following body: ");
        //the following code displays the contents of the table
        WebElement table = driver.findElement(By.id("tablehere"));
        List<WebElement> tableRows = driver.findElements(By.cssSelector("#tablehere table tr"));
        for (int i = 0;i<tableRows.size();i++){
        WebElement currentRow = tableRows.get(i);
           if (i == 0){
               List<WebElement> firstRowColumns = currentRow.findElements(By.cssSelector("th"));
               System.out.println("First Header: " + firstRowColumns.get(0).getText());
               System.out.println("Second Header: " + firstRowColumns.get(1).getText());
           } else {
               List<WebElement> currentColumns = currentRow.findElements(By.cssSelector("td"));
               System.out.println("Text from row " + (i + 1) + ", column 1: " + currentColumns.get(0).getText());
               System.out.println("Text from row " + (i + 1) + ", column 2: " + currentColumns.get(1).getText());
           }
        }
    }

    public static void closeBrowser(){
        //create a method called closeBrowser that closes the driver instance
        driver.quit();
        System.out.println("The browser closed!");
        //display the above message
    }
}

