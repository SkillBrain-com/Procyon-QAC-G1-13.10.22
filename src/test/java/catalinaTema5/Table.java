package catalinaTema5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

    public static void main(String[] args) {
        Table();

    }

    public static ChromeDriver Table() {
        BrowserManager WebdriverManager = null;
        ChromeDriver driver = WebdriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/tag/table.html");
        return new ChromeDriver();
        WebElement tableLink = driver.findElement(By.id("tablestest"));
        System.out.println(tableLink.getText());
        tableLink.click();
        WebElement table = driver.findElement(By.tagName("tr"));
        WebElement[] rows;
        for (WebElement row:rows){
        System.out.println(row.findElement(By.tagName("tr")));
        }
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();
        WebElement doubleClickMe = driver.findElement(By.id("doubleClickButton"));
        doubleClickMe.click();
        driver.quit();
    }
}
