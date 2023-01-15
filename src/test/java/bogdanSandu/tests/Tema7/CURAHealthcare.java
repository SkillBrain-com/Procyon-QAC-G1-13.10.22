package bogdanSandu.tests.Tema7;

import bogdanSandu.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CURAHealthcare {
    static ChromeDriver driver = null;

    @BeforeMethod
    public void openCURAHealthPage() {
        //open home page
        driver = BrowserManager.createDriverAndGetPage();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println("Am deschis CURA Healthcare Service page");
    }

    @Test
    public void login() {
        // go to login page
        WebElement menu = driver.findElement(By.id("menu-toggle"));
        menu.click();
        System.out.println("Click on menu");
        WebElement menuLogin = driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a"));
        menuLogin.click();
        System.out.println("Click on login menu");
        // access elements of login page
        WebElement username = driver.findElement(By.id("txt-username"));
        WebElement password = driver.findElement(By.id("txt-password"));
        WebElement login = driver.findElement(By.id("btn-login"));
        // enter login data
        username.sendKeys("John Doe");
        System.out.println("Completed username");
        password.sendKeys("ThisIsNotAPassword");
        System.out.println("Completed password");
        login.click();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://katalon-demo-cura.herokuapp.com/#appointment";
        try {
            Assert.assertEquals(expectedUrl,actualUrl);
        }
        catch (AssertionError e) {
            System.out.println("Login failed!");
        }
        driver.close();
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
        System.out.println("Am inchis browser-ul");
    }
}
