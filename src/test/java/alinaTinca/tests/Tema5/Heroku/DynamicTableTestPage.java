package alinaTinca.tests.Tema5.Heroku;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableTestPage {

    public static void main(String[] args) {
        goToTheDynamicTableTestPage();
        //check if the method called goToTheDynamicTableTestPage is done successfully
        getTableData("Alina", "123");
        //check if the method called getTableData is done successfully
    }
    public static void goToTheDynamicTableTestPage() {
        //create a method called goToTheDynamicTableTestPage that goes to the link called The Dynamic Table Test Page from this URL and makes different operations there
        ChromeDriver driver = BrowserManager.createChromeDriver();
        //create and configure the Chrome browser page settings
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //go to the Heroku URL
        WebElement link4TDynamicTable = driver.findElement(By.id("dynamictablestest"));
        //search the 5th link
        link4TDynamicTable.click();
        //click on the 5th link
        WebElement firstParagraph = driver.findElement(By.cssSelector(".explanation"));
        //search the first paragraph
        System.out.println("The first paragraph has the following content: " + firstParagraph.getText());
        //display the message from the first paragraph
        WebElement tableSTitle = driver.findElement(By.xpath("//caption[text()='Dynamic Table']"));
        //search the table's title
        System.out.println("The table's title is called: " + tableSTitle.getText());
        //display the table's title
        WebElement table = driver.findElement(By.cssSelector("#dynamictable"));
        //search the table
        System.out.println("The table has the following body: " + table.getText());
        //display the table's content
        WebElement buttonTableData = driver.findElement(By.xpath("//summary[text()='Table Data']"));
        //search the button called Table Data
        buttonTableData.click();
        //click on the button called Table Data
        driver.quit();
        //close the driver instance
    }

    public static void getTableData(String captionInput, String idInput) {
        //create a method called getTableData that checks if it finds the Caption and Id fields from this page and introduces data inside
        ChromeDriver driver = BrowserManager.createChromeDriver();
        //create and set the Chrome browser page
        driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
        //go to Heroku URL
        WebElement buttonTableData = driver.findElement(By.xpath("//summary[text()='Table Data']"));
        //search the button called Table Data
        buttonTableData.click();
        //click on the button called Table Data
//        driver.close();
        //close the driver instance
        WebElement newCaptionInput = driver.findElement(By.id("caption"));
        //search the Caption field
        WebElement newIdInput = driver.findElement(By.id("tableid"));
        //search the Id field
        newCaptionInput.click();
        //click on the Caption field
        newCaptionInput.clear();
        //clear the previous data from Caption field
        newCaptionInput.sendKeys(captionInput);
        //introduce new data in Caption field
        newIdInput.click();
        //click on the Id field
        newIdInput.clear();
        //clear the previous data from Id field
        newIdInput.sendKeys(idInput);
        //introduce new data in Id field
        WebElement refreshTable = driver.findElement(By.id("refreshtable"));
        //search the button called Refresh Table
        refreshTable.click();
        //click on the button called Refresh Table
        driver.quit();
        //close the Chrome browser page
    }
}

