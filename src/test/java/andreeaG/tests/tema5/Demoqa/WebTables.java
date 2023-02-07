package andreeaG.tests.tema5.Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teofilursan.driver.BrowserManager;

public class WebTables {
    public static void main(String[] args) {
        accessWebTables();
    }

    public static void accessWebTables() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/webtables");
        WebElement addNewRecordButton = driver.findElement(By.id("addNewRecordButton"));
        addNewRecordButton.click();
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys( "Ana");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Anescu");
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("a.anescu@getbetter.com");
        WebElement ageNumber = driver.findElement(By.id("age"));
        ageNumber.sendKeys("99");
        WebElement salaryAmount = driver.findElement(By.id("salary"));
        salaryAmount.sendKeys("15000");
        WebElement departmentName = driver.findElement(By.id("department"));
        departmentName.sendKeys(" Quality");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        System.out.println("All information was successfully submitted!");
        driver.quit();
    }
}