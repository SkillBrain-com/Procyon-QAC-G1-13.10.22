package alinaTinca.tests.Tema7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tincaalina.BrowserManager;

public class Tests extends BaseTest {

    WebDriver driver;

    @DataProvider(name = "loginData")
    public Object[][] loginData(){
        return new Object[][] {
                {"John Doe","ThisIsNotAPassword", true},
                {"John Smith","agdagda", false}
        };
    }

    @Test (dataProvider = "loginData")
    public void testLogin(String username, String password, boolean shouldPass){
        driver = BrowserManager.createChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //go to the above URL
        driver.findElement(By.id("#menu-toggle")).click();
        //find the Home button and click on it
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        //find the Login button and click on it
        driver.findElement(By.id("#txt-username")).sendKeys("John Doe");
        //find the username filed and click on it
        driver.findElement(By.id("#txt-password")).sendKeys("ThisIsNotAPassword");
        //find the password field and click on it
    }
}
