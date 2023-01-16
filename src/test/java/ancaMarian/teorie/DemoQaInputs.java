package ancaMarian.teorie;

import ancaMarian.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//@Test ==> ne face toate metodele teste
public class DemoQaInputs {
    ChromeDriver driver;

    @DataProvider(name ="formDetails")
    public Object[][] fullDetails() {
        return new Object[][] {
                {"Anca Marian", "test@test.com"},
                {"Anca", "tst@test.com"}
        };
    }

    @Test(dataProvider = "formDetails")
    public void test2(String name, String email) {
        System.out.println(name +" "+ email);
    }

    @Test
    public void test1() {
        driver = BrowserManager.createDriver();
        driver.get("https://demoqa.com/text-box");
        writeFullName();
        writeEmail();
        writeCurrentAddress();
        writePermanentAddress();
        clickOnSubmitButton();
//       verifySubmittedDetailsHardAssert();
        verifySubmittedDetailsSoftAssert();
        driver.quit();
    }

   public void writeFullName() { //daca schimb in private sau static NU o va lua ca test
       WebElement fullNameInput = driver.findElement(By.id("userName"));
       fullNameInput.sendKeys("Anca Marian");
   }

   public void writeEmail() {
       WebElement emailInput = driver.findElement(By.id("userEmail"));
       emailInput.sendKeys("test@test.com");
   }

   public void writeCurrentAddress() {
       WebElement currentAddress = driver.findElement(By.id("currentAddress"));
       currentAddress.sendKeys("Cluj");
   }

   public void writePermanentAddress() {
       WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
       permanentAddress.sendKeys("Cluuuj");
   }

   public void clickOnSubmitButton() {
        WebElement submitButton = driver.findElement(By.id("submit"));
       JavascriptExecutor executor = (JavascriptExecutor)driver;
       executor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        submitButton.click();
   }

   public void verifySubmittedDetailsHardAssert() { //hard assert ==> nu continua executia, deci nu se mai inchide chrome-ul
        WebElement nameParagraph = driver.findElement(By.id("name"));
       Assert.assertEquals(nameParagraph.getText(), "Name:Anca Marian", "Values are different.");
       WebElement emailParagraph = driver.findElement(By.id("email"));
       Assert.assertTrue(emailParagraph.getText().equals("Email:test@test.com"), "email is not correct.");
//       Assert.assertFalse(!emailParagraph.getText().equals("Email:test@test.com"), "email is not correct."); //la fel ca anterioara
   }

    public void verifySubmittedDetailsSoftAssert() {
        SoftAssert softAssert = new SoftAssert();
        WebElement nameParagraph = driver.findElement(By.id("name"));
        softAssert.assertEquals(nameParagraph.getText(), "Name:Anca Marian", "Values are different.");
        WebElement emailParagraph = driver.findElement(By.id("email"));
        softAssert.assertTrue(emailParagraph.getText().equals("Email:test@test.com"), "email is not correct.");
        softAssert.assertAll();
    }
}
