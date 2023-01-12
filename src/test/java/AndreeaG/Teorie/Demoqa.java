package AndreeaG.Teorie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import teofilursan.driver.BrowserManager;

public class Demoqa {

    ChromeDriver driver;
    @Test
    public void test1(){
        driver= BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/text-box");
        writeFullName();
        writeEmail();
        writeCurrentAddy();
        writePermanentAddy();

        driver.quit();

    }


    public void writeFullName() {

        WebElement fullNameinput = driver.findElement(By.id("userName"));
        fullNameinput.sendKeys("Anamaria");
    }

    public void writeEmail() {

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("a@test.com");
    }


    public void writeCurrentAddy() {
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Iasi");
    }

    public void writePermanentAddy() {
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Iasi");
    }
}