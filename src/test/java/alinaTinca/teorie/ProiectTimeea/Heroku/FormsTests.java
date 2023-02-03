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
        System.out.println("Navigheaza la pagina");
        WebElement paragraph = driver.findElement(By.className("explanation"));
        System.out.println("The message from the paragraph is: " + paragraph.getText());
        WebElement colour = driver.findElement(By.id("colour-picker"));
        colour.sendKeys("#861C06");
        System.out.print("Introducem culoarea cu acest HEX: #861C06");
        //Cum alegem culoarea?
        //JavascriptExecutor jse=(JavascriptExecutor)driver;
        //jse.executeScript("document.getElementByid('colour-picker').value='#861C06'");
        WebElement data = driver.findElement(By.id("date-picker"));
        data.sendKeys("02/04/2023");
        WebElement localDataTime = driver.findElement(By.id("date-time-picker"));
        localDataTime.click();
        //localDataTime.sendKeys("2016-03-03T02:02");
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('date-time-picker').value='2016-03-03T02:02'");
        //Cum alegem ora?
        System.out.println("Introducem aceasta data: 2016-03-03T02:02");
        WebElement email = driver.findElement(By.id("email-field"));
        email.click();
        email.clear();
        email.sendKeys("test@test.com");
        System.out.println("Introducem adresa de email: test@test.com");
        WebElement month = driver.findElement(By.id("month-field"));
        month.clear();
        month.sendKeys("July 2023");
        //Cum alegem anul?
        System.out.println("Introducem aceasta data: July 2023");
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