package catalinaTema5.Heroku;

import catalinaTema5.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

    public static void main(String[] args) {
        Table();

    }

    public static void Table() {

        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/tag/table.html");


        WebElement tableLink = driver.findElement(By.id("tablestest"));
        System.out.println(tableLink.getText());
        tableLink.click();

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        WebElement doubleClick = driver.findElement(By.id("doubleClickButton"));
        doubleClick.click();

        driver.quit();

    }
}
