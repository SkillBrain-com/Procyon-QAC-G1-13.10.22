package cosminneagu.tests.tema5.Heroku;

import cosminneagu.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTestPage {
    public static void main(String[] args) {
        goToTheTableTestPage();

    }

    public static void goToTheTableTestPage(){

        ChromeDriver driver = BrowserManager.createChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement Link4TableTestPage = driver.findElement(By.id("tablestest"));

        Link4TableTestPage.click();

        WebElement firstParagraph = driver.findElement(By.className("explanation"));

        System.out.println("The first paragraph has the following content: " + firstParagraph.getText());

        WebElement titleSTable = driver.findElement(By.xpath("/html/body/div/div[3]/div/table/caption"));

        System.out.println("The table's title is called: " + titleSTable.getText());

        WebElement contentsSTable = driver.findElement(By.id("mytable"));

        System.out.println("The table has the following body: " + contentsSTable.getText());

        driver.quit();

    }
}
