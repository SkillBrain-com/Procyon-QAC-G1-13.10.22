package teofilursan.teorie;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
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
        //verifySubmittedDetails();
        verifySubmittedDetailsSoftAssert();
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
//        Actions actions = new Actions(driver);
//        actions.moveToElement(submitButton).build().perform();
//        submitButton.click();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", submitButton);
    }

    public void verifySubmittedDetails() {
        WebElement nameParagraph = driver.findElement(By.id("name"));
        Assert.assertEquals(nameParagraph.getText(), "Name:Teofil Ursan", "Values are different for name!");
        WebElement emailParagraph = driver.findElement(By.id("email"));
        Assert.assertTrue(emailParagraph.getText().equals("Email:teo@test.com"), "Email is not correct!");
    }

    public void verifySubmittedDetailsSoftAssert() {
        SoftAssert softAssert = new SoftAssert();
        WebElement nameParagraph = driver.findElement(By.id("name"));
        softAssert.assertEquals(nameParagraph.getText(), "Name:Teofil Ursan", "Values are different for name!");
        WebElement emailParagraph = driver.findElement(By.id("email"));
        softAssert.assertTrue(emailParagraph.getText().equals("Email:teo@test.com"), "Email is not correct!");
        softAssert.assertAll();
    }
}
