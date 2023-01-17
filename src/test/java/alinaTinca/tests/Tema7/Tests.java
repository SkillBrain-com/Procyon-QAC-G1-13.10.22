package alinaTinca.tests.Tema7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tincaalina.BrowserManager;

public class Tests extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData(){
        //create an object that returns an Array by type Object that has two dimensions
        return new Object[][] {
                {"John Doe","ThisIsNotAPassword", true},
                //first enter the above valid data
                {"John Smith","agdagda", false}
                //second enter the above invalid data
        };
    }

    @Test (dataProvider = "loginData")
    public void testLogin(String username, String password, boolean testShouldPass){
        driver.get(url);
        //go to the above URL
        WebElement homeButton = driver.findElement(By.id("#menu-toggle"));
        //find the Home button
        homeButton.click();
        //click on home button
        WebElement loginbutton = driver.findElement(By.xpath("//a[text()='Login']"));
        //find the Login button
        loginbutton.click();
        //click on Login button
        WebElement usernameField = driver.findElement(By.id("#txt-username"));
        //find the username filed
        usernameField.sendKeys("John Doe");
        //fill in the username field with the above username
        WebElement passwordField = driver.findElement(By.id("#txt-password"));
        //find the password field
        passwordField.sendKeys("ThisIsNotAPassword");
        //fill in password field with the above password
        WebElement loginSubmitButton = driver.findElement(By.id("#btn-login"));
        //find the login button
        loginSubmitButton.click();
        //click on login button
        if(testShouldPass == true){
            //if the test has passed -> go to the appointment page and display the above message
            Assert.assertEquals("https://katalon-demo-cura.herokuapp.com/#appointment", driver.getCurrentUrl(), "Login has been realized successfully!");
        }else{
            //but if the test has not passed -> display the red message from the login page and try again to login
            Assert.assertEquals("Login failed! Please ensure the username and password are valid.", driver.findElement(By.xpath("//p[@class='lead text-danger']")).isDisplayed(), "Login has been unsuccessfully! Try again!");
        }
    }
}
