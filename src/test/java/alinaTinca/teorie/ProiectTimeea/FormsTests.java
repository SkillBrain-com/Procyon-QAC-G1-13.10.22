package alinatinca.teorie.ProiectTimeea;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.By;
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

        WebElement data = driver.findElement(By.id("date-picker"));
        data.sendKeys("02/04/2023");

        WebElement localDataTime = driver.findElement(By.id("date-time-picker"));
        localDataTime.click();
        localDataTime.sendKeys("03/03/2016 02:02 AM");

        WebElement email = driver.findElement(By.id("email-field"));
        email.click();
        email.clear();
        email.sendKeys("test@test.com");

        WebElement month = driver.findElement(By.id("month-field"));
        month.clear();
        month.sendKeys("Jul 2023");

        WebElement number = driver.findElement(By.id("number-field"));
        number.click();
        number.sendKeys("40");



        driver.quit();

    }
}
