package teofilursan.teorie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaInputs {
    ChromeDriver driver;

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
}
