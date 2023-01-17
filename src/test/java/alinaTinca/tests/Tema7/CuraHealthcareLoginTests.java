package alinaTinca.tests.Tema7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CuraHealthcareLoginTests extends BaseTest {

    @DataProvider(name="loginDataProvider")
    public Object[][] loginDataProvider(){
        //create an object that returns an Array by type Object that has two dimensions for our invalid and valid credentials
        return new Object[][]{
                {"John Doe", "ThisIsNotAPassword", "validCredentials"},
                //valid credentials
                {"Joh Doe", "ThisIsNotAPassword", "invalidCredentials"}
                //invalid credentials
        };
    }

//Ex1, Ex2
    @Test(dataProvider = "loginDataProvider")
    public void loginWithCredentials(String username, String password, String credentialsType){ //S4 parametrii
        WebElement homeMenu = driver.findElement(By.cssSelector(".btn-dark.btn-lg.toggle"));
        //find the Home Menu button
        homeMenu.click();
        //click on home button
        WebElement loginLink = driver.findElement(By.linkText("Login"));  //textul linkului numit Login
        //find the Login button
        loginLink.click();
        //click on Login button
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://katalon-demo-cura.herokuapp.com/profile.php#login",
                //display login page after the login button has been opened
                "Couldn't navigate to login page!");
        //check if the user is redirected to login page when logged in and display an error message if the login button has been opened
        WebElement usernameInput = driver.findElement(By.name("username"));
        //find the username filed
        usernameInput.sendKeys(username); //Step5
        //fill in the username field with the above username
        WebElement passwordInput = driver.findElement(By.name("password"));   //numele unui atribut (valoarea lui de fapt)
        //find the password field
        passwordInput.sendKeys(password); //Step5
        //fill in password field with the above password
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        //find the login button
        loginButton.click();
        //click on login button
        if(credentialsType.equals("validCredentials")) {
            //if credentials are valid
            Assert.assertEquals(driver.getCurrentUrl(),
            //check if the user is redirected to appointment page and display a warning message if login is not successfully
                    "https://katalon-demo-cura.herokuapp.com/#appointment",
                    //display appoitment page after login is successfully
                    "Couldn't navigate to login page!");
                    //display a warning message
            }else{
                WebElement unsuccessfullLoginMesagge = driver.findElement(By.className("text-danger"));
                //else find the red message that appears when login is not successfully
                Assert.assertEquals(unsuccessfullLoginMesagge.getText(),
                //check if the red message appears after the login is not successfully
                "Login failed! Please ensure the username and password are valid.",
                //and display the red message that appears when login is not successfully
                "Shouldn't navigate to appoitment page!");
                //display a warning message
        }
    }

//Ex3
    @Test
    public void verifyRedirectToLoginWhenUserNotLoggedIn(){
        WebElement makeAppoitmentButton = driver.findElement(By.id("btn-make-appointment"));
        //find the make appointment button
        makeAppoitmentButton.click();
        //click on appointment button
        Assert.assertEquals(driver.getCurrentUrl(),  //CurentURL = pagina cu login
        //check if the user can make an appoitment if not logged in
                "https://katalon-demo-cura.herokuapp.com/profile.php#login",  //ce pagina deschide
                //display the login page when the user is not logged in
                "User is not redirected to login page when not logged in!");
                //display a warning message
    }

}


















