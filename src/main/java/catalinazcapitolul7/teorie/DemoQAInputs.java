package catalinazcapitolul7.teorie;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import zoldicatalina2.driver.BrowserMananger;

public class DemoQAInputs {
    public class DemoQaInputs {
        ChromeDriver driver;

        @DataProvider(name="formDeatils")
        public Object[][] fullDetails(){
            return  new Object[][]{
                    {"Zoldi Catalina", "cati@test.com", 1},
                    {"Cati", "cati@test.com"},
                    {"Zoldi Catalina", "cati@test.com", 1},
                    {"Cati", "cati@test.com"},
                    {"Zoldi Catalina", "cati@test.com", 1},
                    {"Cati", "cati@test.com"},
            };
        }
        @Test(dataProvider = "formDetails")
        public void test2(String name, String email, int index){
            System.out.println(name +"" + email "" + index);
        }

        @Test
        public void test1() {
            driver = BrowserMananger.createChromeDriver();
            driver.get("https://demo.com/text-box");

         public void test1(){
            writeFullName();
            writeEmail();
            writeCurrentAddress();
            writePermanentAddress();
            clickOnSubmitButton();
            verifySubmittedDetails();
            verifySubmittedDetailsSoftAssert();
            driver.quit();
        }
    }

    public void writeFullName() {
        By driver = null;
        WebElement fullNameInput = driver.findElement((SearchContext) By.id("userName"));
        fullNameInput.sendKeys("Catalina Zoldi");
    }

    public void writeEmail() {
        By driver = null;
        WebElement emailInput = driver.findElement((SearchContext) By.id("userEmail"));
        emailInput.sendKeys("cati@test.com");
    }

    public void writeCurrentAddress() {
        By driver = null;
        WebElement currentAddressInput = driver.findElement((SearchContext) By.id("currentAddress"));
        currentAddressInput.sendKeys("Timisoara");
    }

    public void writePermanentAddress() {
        By driver = null;
        WebElement permanentAddressInput = driver.findElement((SearchContext) By.id("permanentAddress"));
        permanentAddressInput.sendKeys("Timisoara");
    }

    public void clickOnSubmitButton() {
        By driver = null;
        WebElement submitButton = driver.findElement((SearchContext) By.id("submit"));
        submitButton.click();
        //Actions actions = new Actions(driver);
        //actions.moveToElement(submitButton).build().perform();
        //submitButton.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", submitButton);
    }

    public void verifySubmittedDetails() {
        By driver = null;
        WebElement nameParagraph = driver.findElement((SearchContext) By.id("name"));
        Assert.assertEquals(nameParagraph.getText(), "Name:Catalina Zoldi", "Values are different");
        WebElement emailParagraph = driver.findElement((SearchContext) By.id("email"));
        Assert.assertTrue(!emailParagraph.getText().equals("Email:cati@.test.com"), "Email is not correct!");
    }

    public void verifySubmittedDetailsSoftAssert() {
        SoftAssert softAssert = new SoftAssert();
        By driver = null;
        WebElement nameParagraph = driver.findElement((SearchContext) By.id("name"));
        softAssert.assertEquals(nameParagraph.getText(), "Name:Catalina zoldi", "Values are different for name!");
        WebElement emailParagraph = driver.findElement((SearchContext) By.id("email"));
        softAssert.assertTrue(emailParagraph.getText().equals("Email:cati@test.com"), "Email is not correct!");
        softAssert.assertAll();
    }
}


