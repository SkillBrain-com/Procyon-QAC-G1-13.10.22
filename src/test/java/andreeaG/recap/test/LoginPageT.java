package AndreeaG.recap.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageT extends BaseTest {

    @DataProvider(name="loginDataProvider")
    public Object[][] loginDataProvider() {
        return new Object[][]{
                {"standard_user", "secret_sauce", "testShouldPass"},
                {"problem_user", "secret_sauce", "testShouldPass"},
                {"performance_glitch_user", "secret_sauce", "testShouldPass"},
                {"locked_out_user", "secret_sauce", "testShouldFail"},
                {"standard", "secret_sauce", "testShouldFail"}
        };
    }
    @Test(dataProvider="loginDataProvider")
    public void loginTest (String username, String password, String credentialsType){
        driver.get("https://www.saucedemo.com/");
        WebElement usernameInput =driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(username);
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);
        WebElement loginButton= driver.findElement(By.id("login-button"));
        loginButton.click();
        if (credentialsType.equals("testShouldPass")) {
            Assert.assertEquals(driver.getCurrentUrl(),
                    "https://www.saucedemo.com/inventory.html",
                    "Login doesn't work!");
            WebElement products = driver.findElement(By.className("title"));
            Assert.assertTrue(products.isDisplayed(),"Login does not work!");
            System.out.println("Login successfully!");
        }else{
            WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
            Assert.assertTrue(errorMessage.isDisplayed(), "There is not any warning message!");
            System.out.println("Login failed!");
        }
    }















}
