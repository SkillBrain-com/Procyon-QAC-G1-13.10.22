package neculaclaudiu.teorie;

import neculaclaudiu.driver.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoQaInputs {

    ChromeDriver driver;

    @Test
    public void test(){
        driver = ChromeDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.quit();
    }

    public void writeFullName(){
        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys("Marcela");
    }
    public void writeEmail(){
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("lalalala@yahoo.com");
    }
    public void writeCurrentAddress(){
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("blablabla");
    }
    public void writePermanentAddress(){
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("permanent address");
    }
    public void clickOnSubmitButton(){
        WebElement submitButton = driver.findElement(By.id("submit"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(submitButton).build().perform();
//        submitButton.click();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", submitButton);
    }
    public void verifySubmittedDetails(){
        WebElement nameParagraph = driver.findElement(By.cssSelector("p#name"));
        Assert.assertEquals(nameParagraph.getText(), "Name:Marcela", "Values are different");
        WebElement email = driver.findElement(By.cssSelector("p#email"));
        Assert.assertTrue(email.getText().equals("lalalala@yahoo.com"), "email is invalid");
    }
    public void verifySubmittedDetailsSoftAssert(){
        SoftAssert softAssert = new SoftAssert();
        WebElement nameParagraph = driver.findElement(By.cssSelector("p#name"));
        softAssert.assertEquals(nameParagraph.getText(), "Name:Marcela", "Values are different");
        WebElement email = driver.findElement(By.cssSelector("p#email"));
        softAssert.assertTrue(email.getText().equals("lalalala@yahoo.com"), "email is invalid");
        softAssert.assertAll();
    }
    @DataProvider(name = "formDetails")
    public Object[][] fullDetails() {
        return new Object[][] {
                {"Claudiu", "neculaclaudiu21@gmail.com"},
                {"Marcela", "marcela357@yahoo.com"}
        };
    }
    @Test(dataProvider = "formDetails")
    public void test2(String name, String email){
        driver = ChromeDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys(name);
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys(email);
    }

}
