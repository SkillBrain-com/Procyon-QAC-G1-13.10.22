package sorinfoca.teorie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import teofilursan.driver.BrowserManager;

public class DemoQaInputs {
    ChromeDriver driver;

    @Test
    public void test1() {
        driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/text-box");
        writeFullName();
        writeEmail();
        writeCurrentAddress();
        writePermanentAddress();
        clickOnSubmitButton();
        driver.quit();
    }

    public void writeFullName() {
        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys("Teofil Ursan");
    }

    public void writeEmail() {
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("teo@test.com");
    }

    public void writeCurrentAddress() {
        WebElement currentAddressInput = driver
                .findElement(By.id("currentAddress"));
        currentAddressInput.sendKeys("Iasi");
    }

    public void writePermanentAddress() {
        WebElement permanentAddressInput = driver
                .findElement(By.id("permanentAddress"));
        permanentAddressInput.sendKeys("Iasi");
    }

    public void clickOnSubmitButton() {
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }
}