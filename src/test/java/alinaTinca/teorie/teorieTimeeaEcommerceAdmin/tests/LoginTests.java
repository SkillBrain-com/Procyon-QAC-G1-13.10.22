package alinatinca.teorie.teorieTimeeaEcommerceAdmin.tests;

import alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest{

    WebDriverWait wait;

    @Test(description = "verity login is successfull with a correct username and password")
//    public void testValidLogin(){
//        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.clickOnEmailAndClear();
//        loginPage.clickOnPasswordAndClear();
//        loginPage.inputData("admin@yourstore.com", "admin");
//        loginPage.clickOnLoginButton();
//        Assert.assertTrue(driver.getCurrentUrl().contains("/admin/"), "Login was unsuccessful with the default data!");
////        Assert.assertEquals(driver.getCurrentUrl(), "https://admin-demo.nopcommerce.com/admin/",
////                "Login was unsuccessful with the default data!");
//    }


//    //SAU
    @DataProvider(name = "loginDataProvider")
    public Object[][] loginDataProvider(){
        return new Object[][]{
                {"admin@yourstore.com", "admin", "validCredentials"},
                //test case with valid credentials - test passed!
                {"admi@yourstore.com", "admin", "invalidCredentials"}
                //test case with invalid credentials - test failed!
        };
    }

    @Test(dataProvider = "loginDataProvider", description = "verify login scenarios with valid and invalid data")
    public void loginTest(String emailData, String passwordData, String credentialsType){
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F",
                "Could not navigate to login page!");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnEmailAndClear();
        loginPage.clickOnPasswordAndClear();
        loginPage.inputData(emailData, passwordData);
        loginPage.clickOnLoginButton();
        if (credentialsType.equals("validCredentials")) {
            Assert.assertEquals("https://admin-demo.nopcommerce.com/admin/",
                    "https://admin-demo.nopcommerce.com/admin/",
                    "Could not navigate to admin page!");
        }else{
            wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            WebElement textWarning = driver.findElement(By.cssSelector(".validation-summary-errors"));
            Assert.assertEquals(textWarning.getText(),
                    "Login was unsuccessful. Please correct the errors and try again.\n" +
                            "No customer account found",
                    "Shouldn't navigate to admin page!");
        }
    }


}
