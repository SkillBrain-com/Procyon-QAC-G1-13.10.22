package alinatinca.teorie;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import alinatinca.driver.BrowserManager;

@Test
public class DemoQaInputs {

    ChromeDriver driver;

    @DataProvider(name = "formDetails")
    public Object[][] fullDetails() {
        return new Object[][]{
                {"Alina tinca", "test@test.com", 1},
                {"Teo", "test2@test.com", 2},
                {"Teofil Ursan", "teofil@test.com", 1},
                {"Teo", "tefil@test.com", 2},
                {"Teofil Ursan", "teofil@test.com", 1},
                {"Teo", "tefil@test.com", 2}
        };
    }

    @Test(dataProvider = "formDetails")
    public void test2(String name, String email, int index) {
        System.out.println(name +" " + email + " " + index);
    }

    @Test
    public void test1(){
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://demoqa.com/text-box");
        writeFullName();
        writeEmail();
        writeCurrentAddress();
        writePermanentAddress();
        clickOnSubmitButton();
//        verifySubmittednDetails();
        verifySubmittednDetailsSoftAssert();
        driver.quit();
    }

    public void writeFullName() {
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Alina Tinca");
    }

    public void writeEmail() {
        WebElement emailImput = driver.findElement(By.id("userEmail"));
        emailImput.sendKeys("test@test.com");
    }

    public void writeCurrentAddress(){
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Bucharest");
    }

    public void writePermanentAddress() {
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Bucuresti");
    }

    public void clickOnSubmitButton(){
        WebElement submitButton = driver.findElement(By.id("submit"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", submitButton);
    }

    public void verifySubmittednDetails() {
        WebElement nameParagraph = driver.findElement(By.id("name"));
        Assert.assertEquals(nameParagraph.getText(), "Name: A", "Values are different");
        WebElement email = driver.findElement(By.id("email"));
        Assert.assertTrue(!email.getText().equals("Email:test@test.com"), "Email is not correct");
    }

        public void verifySubmittednDetailsSoftAssert(){
            SoftAssert softAssert = new SoftAssert();
            WebElement nameParagraph = driver.findElement(By.id("name"));
            softAssert.assertEquals(nameParagraph.getText(), "Name: A", "Values are different");
            WebElement email = driver.findElement(By.id("email"));
            softAssert.assertTrue(!email.getText().equals("Email:test@test.com"), "Email is not correct");
        }
}