package elizCurtnazar.teorie;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import teofilursan.driver.BrowserManager;

public class DemoQaInputs {
    ChromeDriver driver;

    @DataProvider(name = "formDetails") //
    public Object[][] fullDetails() {
        return new Object[][]{
                {"Eliz", "test@test.com", 1},
                {"Teo", "test2@test.com", 2},
                {"Mara", "teofil@test.com", 1},
                {"carlos", "tefil@test.com", 2},
                {"zain", "teofil@test.com", 1},
                {"Teodor", "tefil@test.com", 2}
        };
    }

    @Test(dataProvider = "formDetails")
    public void test2(String name, String email, int index) {
        System.out.println(name +" " + email + " " + index);
    }
    @Test
    public void test1(){
        driver = BrowserManager.createChromeDriver();
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
        fullName.sendKeys("Eliz Curtnazar");
    }

    public  void writeEmail() {
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("eliz_rts_91@hotmail.com");
    }

    public void writeCurrentAddress() {
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Lumina");
    }

    public void writePermanentAddress() {
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Navodari");
    }

    public void clickOnSubmitButton(){
        WebElement submitButton = driver.findElement(By.id("submit"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", submitButton);//cand nu merge action moveToElement
    }
    public void verifySubmittednDetails() { //hardAssert
        WebElement nameParagraph = driver.findElement(By.id("name"));
        Assert.assertEquals(nameParagraph.getText(), "Name: A", "Values are different");
        WebElement email = driver.findElement(By.id("email"));
        Assert.assertTrue(!email.getText().equals("Email:test@test.com"), "Email is not correct");

    }
    public void verifySubmittednDetailsSoftAssert(){ //softAssert
        SoftAssert softAssert = new SoftAssert();
        WebElement nameParagraph = driver.findElement(By.id("name"));
        softAssert.assertEquals(nameParagraph.getText(), "Name: A", "Values are different");
        WebElement email = driver.findElement(By.id("email"));
        softAssert.assertTrue(!email.getText().equals("Email:test@test.com"), "Email is not correct");
//        softAssert.assertAll();
    }
}
