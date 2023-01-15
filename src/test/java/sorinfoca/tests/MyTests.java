package sorinfoca.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sorinfoca.driver.BrowserManager;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MyTests extends TestConfig {

    WebDriver driver;

    @DataProvider(name = "LoginDataProvider")
    public static Object[][] loginData() {
        return new Object[][] {
                {"John Doe", "ThisIsNotAPassword", true},
                {"invalid_username", "invalid_password", false},
        };
    }

    @DataProvider(name = "AppointmentDataProvider")
    public static Object[][] AppointmentData() {
        return new Object[][] {
                {"10/10/23", "Comentariu pozitiv", true},
                {"", "Comentariu negativ", false},
        };
    }

    @Test(dataProvider = "LoginDataProvider")
    public void testLogin(String username, String password, boolean shouldPass) {
        driver = BrowserManager.createChromeDriver();
        driver.get(getBaseUrl());
        driver.findElement(By.cssSelector("#menu-toggle")).click();
        driver.findElement(By.cssSelector("#sidebar-wrapper > ul > li:nth-child(4) > a")).click();
        driver.findElement(By.cssSelector("#txt-username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        if(shouldPass) {
            assertEquals("https://katalon-demo-cura.herokuapp.com/#appointment",driver.getCurrentUrl());
            logOut();
        }
        else {
            assertTrue(driver.findElement(By.cssSelector("#login > div > div > div.col-sm-12.text-center > p.lead.text-danger")).isDisplayed());
        }
        driver.quit();
    }

    @Test(dataProvider = "AppointmentDataProvider")
    public void testAppointment(String data, String comentariu, boolean shouldPass){
        driver = BrowserManager.createChromeDriver();
        driver.get(getBaseUrl());
        driver.findElement(By.cssSelector("#menu-toggle")).click();
        driver.findElement(By.cssSelector("#sidebar-wrapper > ul > li:nth-child(4) > a")).click();
        driver.findElement(By.cssSelector("#txt-username")).sendKeys("John Doe");
        driver.findElement(By.name("password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        driver.findElement(By.cssSelector("#chk_hospotal_readmission")).click();
        driver.findElement(By.cssSelector("#radio_program_medicaid")).click();
        driver.findElement(By.name("visit_date")).sendKeys(data);
        driver.findElement(By.cssSelector("#txt_comment")).sendKeys(comentariu);
        driver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]")).click();
        if(shouldPass) {
            assertTrue(driver.findElement(By.cssSelector("#summary > div > div > div.col-xs-12.text-center > h2")).isDisplayed());
            logOut();
        }
        else {
            assertEquals("https://katalon-demo-cura.herokuapp.com/#appointment", driver.getCurrentUrl());
        }
        driver.quit();
    }

    @Test
    public void test1() {
        driver = BrowserManager.createChromeDriver();
        testRedirectToLogin();
        testHomeButton();
        driver.quit();
    }

    public void testRedirectToLogin() {
        driver.get(getBaseUrl());
        driver.findElement(By.cssSelector("#btn-make-appointment")).click();
        assertEquals("https://katalon-demo-cura.herokuapp.com/profile.php#login",driver.getCurrentUrl());
    }

    public void testHomeButton() {
        driver.get(getBaseUrl());
        driver.findElement(By.cssSelector("#menu-toggle")).click();
        driver.findElement(By.cssSelector("#sidebar-wrapper > ul > li:nth-child(3) > a")).click();
        assertEquals(getBaseUrl() , driver.getCurrentUrl());
    }

    public void logOut() {
        driver.findElement(By.cssSelector("#menu-toggle")).click();
        driver.findElement(By.cssSelector("#sidebar-wrapper > ul > li:nth-child(6) > a")).click();
    }
}
