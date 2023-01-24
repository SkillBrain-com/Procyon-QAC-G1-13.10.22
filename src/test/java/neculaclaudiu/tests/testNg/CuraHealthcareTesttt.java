package neculaclaudiu.tests.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CuraHealthcareTesttt extends BaseTest{
    @Test
    public void loginWithValidAccount(){
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement expandButton = driver.findElement(By.cssSelector("a#menu-toggle i"));
        expandButton.click();
        WebElement loginButton = driver.findElement(By.cssSelector("a[href = \"profile.php#login\"]"));
        loginButton.click();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://katalon-demo-cura.herokuapp.com/profile.php#login",
                "Could not navigate to login url");
        WebElement usernameInput = driver.findElement(By.id("txt-username"));
        usernameInput.sendKeys("John Doe");
        WebElement passwordInput = driver.findElement(By.id("txt-password"));
        passwordInput.sendKeys("ThisIsNotAPassword");
        WebElement login = driver.findElement(By.id("btn-login"));
        login.click();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://katalon-demo-cura.herokuapp.com/#appointment",
                "Could not navigate to appoiment page ");

    }
}
