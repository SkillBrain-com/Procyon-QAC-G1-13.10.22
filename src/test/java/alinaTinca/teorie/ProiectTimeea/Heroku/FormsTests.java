package alinatinca.teorie.ProiectTimeea.Heroku;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormsTests {

    public static void main(String[] args) {
        fillFormData();
    }

    public static void fillFormData() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/html5-form-test.html");
        WebElement paragraph = driver.findElement(By.className("explanation"));
        System.out.println("The message from the paragraph is: " + paragraph.getText());
        WebElement colour = driver.findElement(By.id("colour-picker"));
        colour.sendKeys("#861C06");
        //JavascriptExecutor jse=(JavascriptExecutor)driver;
        //jse.executeScript("document.getElementByid('colour-picker').value='#861C06'");
        // Cum alegem culoarea?
        WebElement data = driver.findElement(By.id("date-picker"));
        data.sendKeys("02/04/2023");
        WebElement localDataTime = driver.findElement(By.id("date-time-picker"));
        localDataTime.click();
        //localDataTime.sendKeys("2016-03-03T02:02");
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('date-time-picker').value='2016-03-03T02:02'");
        // Cum alegem ora?
        WebElement email = driver.findElement(By.id("email-field"));
        email.click();
        email.clear();
        email.sendKeys("test@test.com");
        WebElement month = driver.findElement(By.id("month-field"));
        month.clear();
        month.sendKeys("July 2023");
        // Cum alegem anul?
        WebElement number = driver.findElement(By.id("number-field"));
        number.click();
        for (int i =0; i< 5; i++) {
            number.sendKeys(Keys.UP);
        }
        for (int i =0; i< 5; i++) {
            number.sendKeys(Keys.UP);
        }
        // Cum alegem un numar?
        driver.quit();
    }
}