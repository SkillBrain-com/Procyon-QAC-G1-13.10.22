package catalinaTema5.DemoqaElements;

import catalinaTema5.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
    public static void main(String[] args) {
        goToWebTablesPage();

    }
    public static void goToWebTablesPage() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/webtables");
        WebElement searchButton = driver.findElement(By.id("basic-addon2"));
        searchButton.click();
        searchButton.sendKeys("Harry Potter");
        WebElement AddButton = driver.findElement(By.id("addNewRecordButton"));
        AddButton.click();
        WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
         firstName.click();
        firstName.sendKeys("Harry");
        WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        lastName.click();
        lastName.sendKeys("Potter");
        WebElement fullAge = driver.findElement(By.cssSelector("input[placeholder='Age']"));
        fullAge.click();
        fullAge.sendKeys("25");
        WebElement eMail = driver.findElement(By.cssSelector("input[placeholder='Email']"));
        eMail.click();
        eMail.sendKeys("potter@mail.com");
        WebElement salary = driver.findElement(By.cssSelector("input[placeholder='Salary']"));
        salary.click();
        salary.sendKeys("40000");
        WebElement departament = driver.findElement(By.cssSelector("input[placeholder='Departament']"));
        departament.click();
        departament.sendKeys("ofMysteries");
        WebElement deleteIcon = driver.findElement(By.cssSelector("span[id='delete-record-5"));
        deleteIcon.click();
        WebElement deleteRow = driver.findElement(By.cssSelector("rt-tr -even"));
        deleteRow.click();
        driver.quit();
  }
}
